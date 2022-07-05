
insert into manager(password,account) values('111111111','111111111'),
                                            ('111111112','111111111'),
                                            ('111111122','111111122');
insert into customer(name,gender,age,tel,idcardnumber,filenumber,account,password,height,birthday) values('mike','男',77,13203421216,1111111111113355,77788899
                                                                                                         ,1111111777,111111886,182,'1947-11-02'),
                                                                                                         ('tom','男',79,13200001216,1111111111113333,77788888
                                                                                                         ,1111111111,111111866,175,'1945-11-02'),
                                                                                                         ('mike','男',87,13203421216,1111111111113366,77788800
                                                                                                         ,1111111888,111111855,169,'1937-11-02');
insert into staff(client_name,client_gender,client_id,client_type,client_account,client_password,client_tel,client_relation)values('马云','男',00000001,'护士',1111111111,
                                                                                                                                   111111112,12300001216,'照顾用户tom和ron'),
                                                                                                                                  ('马化腾','男',00000002,'医生',1111111222,
                                                                                                                                   111111332,12300011216,'医治tom'),
                                                                                                                                  ('李彦宏','男',00000003,'护工',1111111113,
                                                                                                                                   111111113,12300021216,'护理mike');
insert into checkinrecord(bedid,checkindate,expirationdate,attention,checkin_id)values(111,'2021-12-12','2022-01-08','无',1),
                                                                                      (112,'2021-11-12','2022-01-18','高危病人',2),
                                                                                      (113,'2021-12-13','2022-02-08','抑郁症患者',3);
insert into retreatrecord (retreattime,retreatreason,asktime,auditperson,auditopinion,retreat_id)values('2022-01-08','已治愈','2022-01-06',
                                                                                                        '小明','无',2),
                                                                                                       ('2022-01-09','已治愈','2022-01-06',
                                                                                                        '小张','无',3),
                                                                                                       ('2022-01-06','已治愈','2022-01-05',
                                                                                                        '小王','无',1);
insert into foodrecord(food,food_date,food_id)values('早上：牛肉面 中午：白菜-土豆炒牛肉-西红柿炒蛋 晚上：青菜-青椒炒肉','2022-06-07',1),
                                                    ('早上：牛肉面 中午：花菜-土豆炒牛肉-西红柿炒蛋 晚上：青菜-青椒炒肉','2022-06-08',3),
                                                    ('早上：牛肉面 中午：空心菜-土豆炒牛肉-西红柿炒蛋 晚上：青菜-青椒炒肉','2022-06-09',2);
insert into nursingrecord (content,startdate,enddate,record_userid,record_levelid)values('整理房间、换药','2022-06-09','2022-06-22',1,1),
                                                                                        ('整理房间、换药','2022-06-11','2022-06-21',2,2),
                                                                                        ('整理房间、换药','2022-06-12','2022-06-22',3,3);
insert into nursinglevel(name,state)values('三级护理',0),
                                          ('四级护理',1),
                                          ('特级护理',1);
insert into outgoing(outgoingreason,outgoingtime,expectedreturntime,actualreturntime,escort,escorttel,outgoing_id)values
                                                                                                                      ('透透气','2022-06-22,12:02','2022-06-22,13:30','2022-06-22,13:25','小明',13507011111,1),
                                                                                                                      ('透透气','2022-06-22,12:03','2022-06-22,13:30','2022-06-22,13:24','小明',13507011222,2),
                                                                                                                      ('透透气','2022-06-22,12:04','2022-06-22,13:30','2022-06-22,13:22','小明',13507011333,3);
insert into bedmanage(roomid,buildingid,isavailable,userid)values
                                                               (312,4,1,1),
                                                               (121,2,1,2),
                                                               (322,4,0,3);
