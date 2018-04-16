# chatbase-kotlin-sdk
Chatbase SDK made in Kotlin

## Instalation

### Gradle
``` Groovy
repositories {
    jcenter()
}

dependencies {
    compile 'com.samuelbirocchi:chatbase-sdk:0.0.2'
}
```

### Maven

``` Xml
<repositories>
    <repository>
      <id>jcenter</id>
      <url>https://jcenter.bintray.com/</url>
    </repository>
</repositories>

<dependency>
    <groupId>com.samuelbirocchi</groupId>
    <artifactId>chatbase-sdk</artifactId>
    <version>0.0.2</version>
</dependency>
```

## Usage

```Kotlin
val message = ChatbaseRequestMessage(
                                  "your api key",
                                  "user id",
                                  AgentType.BOT, // or AgentType.USER
                                  "message",
                                  "intent name",
                                  "version",
                                  "platform",
                                  true, // is handled
                                  null, // optional property list
                                  Date().time // Timestamp
                              )

val request = ChatbaseRequest(listOf(message))

ChatbaseClient().sendAnalytics(chatbaseRequest)
```
