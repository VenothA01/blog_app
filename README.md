# Blog API in spring boot

## Development


## Database set up

### MySQL

### Postgres

To login to postgres database, use the following command:

```bash
psql postgres # for MacOs
```
Create Database username and password

Login to postgres database

```bash

CREATE DATABASE blog;
CREATE USER blog_user WITH ENCRYPTED PASSWORD 'blog';
GRANT ALL PRIVILEGES ON DATABASE blog TO blog_user;
```

`` `bash
# Login to postgres database
psql -U blog_user -d blog -h localhost -W
`` `

