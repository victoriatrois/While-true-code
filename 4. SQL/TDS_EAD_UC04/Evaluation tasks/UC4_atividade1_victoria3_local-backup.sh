Last login: Thu May 26 16:27:59 on ttys000
v3gc@Victorias-MacBook-Pro ~ % #!/bin/sh
FILE=backup.sql.`date +"%Y%m%d"`
DBSERVER=127.0.0.1
# DBSERVER=localhost
DATABASE=UC4atividades
USER=root
PASS=@DBroot
unalias rm 2> /dev/null

rm ${FILE} 2> /dev/null
rm ${FILE}.gz 2> /dev/null

mysqldump --opt --user=${USER} --password=${PASS} ${DATABASE} > ${FILE}
gzip $FILE
echo "${FILE}.gz was created:"
ls -l ${FILE}.gz







