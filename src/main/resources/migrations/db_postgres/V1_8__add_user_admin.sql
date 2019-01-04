
/*
criar o arquivo de migracao na mao msm!!!
  mvn flyway:baseline
  mvn flyway:info
  mvn flyway:migrate
  mvn flyway:clean
 */

INSERT INTO "user_mgmt".users (version, name, login, email, birthday, phone, password, creation_time)
SELECT 1,'Marcos Henrique Barros Pinto', 'marcoscba', 'marcoscba@gmail.com', to_date('27/07/1982','DD/MM/YYYY'), '11985733131', 'master', NOW()
WHERE NOT EXISTS (
   SELECT 1 FROM "user_mgmt".users WHERE email = 'marcoscba@gmail.com'
);

INSERT INTO "user_mgmt".users (version, name, login, email, birthday, phone, password, creation_time)
SELECT 1,'Geovanne Fernandes Duarte', 'geovannefd' ,'geovannefd@gmail.com', to_date('08/04/1989','DD/MM/YYYY') , '11982019568', 'master', NOW()
where not exists (
   select 1 from "user_mgmt".users where email = 'geovannefd@gmail.com'
);