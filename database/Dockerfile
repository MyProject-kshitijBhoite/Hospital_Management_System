FROM mysql
ENV MYSQL_ROOT_PASSWORD "manager"
ENV MYSQL_DATABASE "hospital_management"
COPY hospital.sql /docker-entrypoint-initdb.d
COPY my.cnf /etc/mysql/my.cnf
EXPOSE 3306 