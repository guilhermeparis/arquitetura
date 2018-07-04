FROM mongo
COPY dados.json /dados.json
CMD mongoimport --host db --db hpApiDev --collection coll --type json --file /dados.json --jsonArray
