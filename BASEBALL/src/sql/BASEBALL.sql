CREATE TABLE baseball(
    team_name VARCHAR(15) PRIMARY KEY,
    play_total NUMBER,
    win NUMBER,
    lose NUMBER,
    same NUMBER,
    WinPoint NUMBER(5),
    difference NUMBER,
    recentTen VARCHAR2(30),
    conti VARCHAR2(10),
    home VARCHAR2(20),
    visit VARCHAR2(10)
);


SELECT * FROM baseball;
commit;

INSERT INTO baseball test values ('test', 150,90,50,10,0.15,3,7,3,2,2)

