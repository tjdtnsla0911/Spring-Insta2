# Spring-Insta2
```
새로 만드는중 심심해서중입니다.
전에 만든건 private로 숨겼고 이번은 CSS만 복붙하고 나머지는 완전 색다른 기능까지 추가할생각입니다.
그리고 새로운 어노테이션및 기능도 넣을 생각입니다. 또한 DB설계가 우선이긴한데 이번엔 쿼리공부겸 후회좀하게
만들면서 컬럼 추가할생각입니다.(목적은 내공부)


이번에 많이쓸기술

HashMap(List로 많이 myBatis로 가져갔는데 이번은 가능한 억지로라도 해쉬맵을 많이쓸생각입니다 )
Mybatis의 forEeach(HashMap이랑 같이 쓸생각)
async + Promise(비동기의 꽃!)
ajax에서 내가 써보지 못한기능들(억지로라도 쓸생각!)
각종 어노테이션(사실 이건 억지로라도 쓰기힘들긴한데.. 쓸기회있으면 무조껀쓰기)
서브쿼리 + Inner Join(원래 많이썻지만 더쓸거임 쓸필요없어도 써서 만들생각)

추가할 기술
페이징
진짜 인스타 처럼 보이게하기
기타 등등..
```
```
2021-01-30 01:14
현재 CSS 전에쓰던거 퍼오고(어차피는 퍼블이아니야...)
시큐리티+jwt 
```

```
2021-01-29 20:52
현재 MySQl 필요한 테이블

테이블명 User

id int(11) AI PK 
bio varchar(255) 
createDate datetime(6) 
email varchar(255) 
gender varchar(255) 
name varchar(255) 
password varchar(255) 
phone varchar(255) 
profileImage varchar(255) 
provider varchar(255) 
providerId varchar(255) 
role varchar(255) 
username varchar(255) 
website varchar(255)

앞으로 쓸 테이블(미구현, 앞으로 더만들꺼임)

댓글
id int(11) AI PK 
content varchar(255) 
createDate datetime(6) 
imageId int(11) 
userId int(11)
```
