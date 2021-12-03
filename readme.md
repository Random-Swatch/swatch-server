# Swatch server

---

## Pre-requisites
* JDK 11
* Maven 3.8.4

## How to build

* `mvn clean install`

## How to run

### Using binary

#### Using jar

* `java -jar target/swatch-server-0.0.1-SNAPSHOT.jar`

#### Using spring maven plugin

* `mvn spring-boot:run`

### Using Docker

* `docker build -t swatch/server:0.0.1 .`
* `docker run -p 8080:8080 -d swatch/server:0.0.1 >> ../server.pid`

## How to test

* Run following `curl` request in the terminal

`curl -v http://localhost:8080/swatch`

* Expected output

```json
[

    {
        "type":"HSL",
        "syntax":"hsl(164, 75%, 93%)",
        "isCssCompatible":true
    },
    {
        "type":"HSL",
        "syntax":"hsl(29, 88%, 33%)",
        "isCssCompatible":true
    },
    {
        "type":"HSL",
        "syntax":"hsl(121, 72%, 69%)",
        "isCssCompatible":true
    },
    {
        "type":"RGB",
        "syntax":"rgb(161, 25, 95)",
        "isCssCompatible":true
    },
    {
        "type":"RGB",
        "syntax":"rgb(65, 116, 179)",
        "isCssCompatible":true
    }

]
```