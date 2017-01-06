-- 기존 테이블 제거
DROP TABLE Reservation;
DROP TABLE Address;
DROP TABLE Theater;
DROP TABLE Customer;
DROP TABLE Movie;
DROP TABLE Multiplex;
DROP TABLE Actor;
DROP TABLE Review;
DROP TABLE Master;

-- 마스터 계정 테이블
CREATE TABLE Master(
	master_id VARCHAR2(10), -- Master 계정의 ID
	master_pw VARCHAR2(25) NOT NULL, -- Master 계정의 PW
	PRIMARY KEY(master_id)
);

-- 리뷰 테이블
CREATE TABLE Review(
	review_seq DECIMAL, 
	review_comment VARCHAR2(220) NOT NULL, -- 리뷰의 글 내용
	review_date VARCHAR2(16) NOT NULL, -- 리뷰가 올라온 날짜
	review_starrate DECIMAL NOT NULL, -- 리뷰에 올라온 별점
	review_usercheck BOOLEAN NOT NULL, -- 관람객의 시청 여부(True:시청 / False:시청안함)
	mv_seq DECIMAL NOT NULL, -- FK, Movie의 PK
	PRIMARY KEY(doc_id),
	FOREIGN KEY(mv_seq) REFERENCES Movie(mv_seq)
);

-- 영화배우 테이블
CREATE TABLE Actor(
	actor_seq DECIMAL,
	mv_seq DECIMAL NOT NULL, -- FK, Movie의 PK
	actor_name VARCHAR2(15) NOT NULL, -- 영화배우 이름
	actor_info VARCHAR2(150) NOT NULL, -- 영화배우 정보
	actor_pic VARCHAR2(150) NOT NULL, -- 영화배우 사진 파일의 링크
	actor_role VARCHAR2(150) NOT NULL, -- 영화 내에서 영화 배우 역할
	PRIMARY KEY(actor_seq),
	FOREIGN KEY(mv_seq) REFERENCES Movie(mv_seq)
);

-- 상영관 테이블
CREATE TABLE Multiplex(
	multi_seq DECIMAL,
	multi_name VARCHAR2(50) NOT NULL, -- 영화관 이름
	multi_kind VARCHAR2(20) NOT NULL, -- 영화관 종류(ex: Superplex G, charlotte..)
	multi_axis VARCHAR2(30) NOT NULL, -- 영화관 위치의 좌표
	multi_addprice DECIMAL NOT NULL, -- 영화관 사용 시 추가 발생 금액
	traffic VARCHAR2(150) NOT NULL, -- 영화관 대중교통정보
	multi_salestotal DECIMAL NOT NULL, -- 영화관 총 매출
	PRIMARY KEY(multi_seq)
);

-- 영화 테이블
CREATE TABLE Movie(
	mv_seq DECIMAL,
	mv_name VARCHAR2(50) NOT NULL, -- 영화 제목
	mv_rank DECIMAL NOT NULL, -- 영화 순위
	mv_actor VARCHAR2(40) NOT NULL, -- 감독 및 출연 배우 리스트
	mv_detail VARCHAR2(1000) NOT NULL, -- 영화 상세 설명, HTML 태그 추가 가능
	mv_poster VARCHAR2(150) NOT NULL, -- 영화 포스터 이미지 링크
	mv_trailer VARCHAR2(150) NOT NULL, -- 영화 트레일러 영상 링크(YouTube)
	mv_starrate DECFLOAT NOT NULL, -- 영화 평점
	mv_salestotal DECIMAL NOT NULL, -- 영화 총 매출
	mv_grade VARCHAR2(30) NOT NULL, -- 영화 등급 (ex: [국내]12세이상관람가)
	mv_comingdate VARCHAR2(10) NOT NULL, -- 영화 개봉일
	mv_basicinfo VARCHAR2(30) NOT NULL, -- 영화 기본 정보(ex: 애니메이션 일본(106분))
	mv_type VARCHAR2(40) NOT NULL, -- 영화 타입 (ex: 2D | 일반 | 일반사운드 | 자막)
	mv_homepage VARCHAR2(30), -- 영화 공식 홈페이지, NULL 가능
	mv_theater VARCHAR2(8), -- 스페셜관 상영정보 (ex: Superplex G, charlotte..)
	PRIMARY KEY(mv_seq)
);

-- 관람객 테이블
CREATE TABLE Customer(
	cus_seq DECIMAL,
	cus_id VARCHAR2(15) NOT NULL, -- 관람객의 ID
	cus_pw VARCHAR2(15) NOT NULL, -- 관람객 ID의 PW
	cus_name VARCHAR2(15) NOT NULL, -- 관람객의 이름
	email VARCHAR2(40) NOT NULL, -- 관람객의 e-mail
	phone VARCHAR2(15) NOT NULL, -- 관람객의 전화번호
	birth VARCHAR2(16) NOT NULL, -- 관람객의 생일
	gender VARCHAR2(1) NOT NULL, -- 관람객의 성별 (남:'M', 여:'F')
	card VARCHAR2(25) NOT NULL, -- 관람객의 카드 번호
	bank VARCHAR2(10) NOT NULL, -- 관람객 카드 계좌의 은행
	PRIMARY KEY(cus_seq)
);

-- 영화관의 작은관 테이블
CREATE TABLE Theater(
	theater_seq DECIMAL,
	t_seatcnt DECIMAL NOT NULL, -- 관람관 현재 예매 누적수
	t_seatmaxcnt DECIMAL NOT NULL, -- 관람관 최대 예매 가능수
	multi_seq DECIMAL NOT NULL, -- FK, 영화관의 PK
	PRIMARY KEY(theater_seq),
	FOREIGN KEY(multi_seq) REFERENCES Multiplex(multi_seq)
);

-- 주소 테이블, 영화관 및 사용자의 주소를 받아오는 테이블
CREATE TABLE Address(
	addr_seq DECIMAL,
	addr VARCHAR2(100) NOT NULL, -- 영화관 또는 관람객 주소
	PRIMARY KEY(addr_seq)
);

-- 예약 테이블
CREATE TABLE Reservation(
	res_seq DECIMAL,
	cus_seq DECIMAL NOT NULL, -- FK, Customer의 PK
	mv_seq DECIMAL NOT NULL, -- FK, Movie의 PK
	addr_seq DECIMAL NOT NULL, -- FK, Address의 PK
	theater_seq DECIMAL NOT NULL, -- FK, Theater의 PK
	res_seatno VARCHAR2(4) NOT NULL, -- 예약한 좌석
	res_price DECIMAL NOT NULL, -- 예약한 영화의 가격
	res_datetime VARCHAR2(16) NOT NULL, -- 예약한 영화의 날짜 및 시간
	PRIMARY KEY(res_seq),
	FOREIGN KEY(cus_seq) REFERENCES Customer(cus_seq),
	FOREIGN KEY(mv_seq) REFERENCES Movie(mv_seq),
	FOREIGN KEY(addr_seq) REFERENCES Address(addr_seq),
	FOREIGN KEY(theater_seq) REFERENCES Theater(theater_seq)
);
