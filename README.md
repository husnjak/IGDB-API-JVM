# IGDB API-JVM (V3)
A Kotlin wrapper for the IGDB.com Video Game Database API. 

__IMPORTANT__

This wrapper is compatible with ONLY their newest release V3.

## About IGDB
One of the principles behind IGDB.com is accessibility of data. We wish to share the data with anyone who wants to build cool videogame oriented websites, apps and services. This means that the information you contribute to IGDB.com can be used by other projects as well.

Thus, you are not only contributing to the value of this site but to thousands of other projects as well. We are looking forward to see what exciting game related projects you come up with. Happy coding!

More info here:
* [About the API](https://www.igdb.com/api)
* [API Documentation](https://api-docs.igdb.com/)

## About the wrapper
This wrapper is written in Kotlin which uses the JVM and works with both Koltin & Java projects. I have not tested it on other JVM languages but it should work for these languages as well. The examples bellow showcase this wrapper in both Kotlin and Java.

Feel free to test it your selves :)

The Wrapper can handle both the IGDB generated classes and JSON (Strings), I have choosen to make the Generated classes the standard because it will make it easier to use, you dont have to create your own classes to hold the information.

# Installation and setup

__Maven__

```maven
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependency>
    <groupId>com.github.husnjak</groupId>
    <artifactId>apiV3-jvm</artifactId>
    <version>0.1</version>
</dependency>
```

__Gradle__
  
Step 1. Add this in your root build.gradle at the end of the repositories:
```Gradle
repositories {
    maven { url 'https://jitpack.io' }
}
```
  Step 2. Add the dependency
``` Gradle
dependencies {
    implementation 'com.github.husnjak:apiV3-jvm:0.1'
}
```
  Optional Step 3 (Android). Add internet permissions in the manifest
``` xml
<uses-permission android:name="android.permission.INTERNET" />
```

## Using your API key
* Create a new IGDBWrapper object and give it your API key.
``` java
// Java Example
IGDBWrapper wrapper = IGDBWrapper.INSTANCE;
wrapper.setUserkey("YOUR_API_KEY");
```
``` kotlin
// Kotlin Example
IGDBWrapper.userkey = "YOUR_API_KEY"
```

# How to use the wrapper
The wrapper has two "wrapping" functions and a lot of helper funtions (one for each endpoint..)  
The two main functions are called `apiRequest` and `apiJsonRequest` and they handle all of the requests to the api.  
The class `APICalypse` handles the new querying language, so that you dont need to care about structure and syntax as much.

* `apiRequest`  
  This method handles IGDB generated proto classes which returns an ByteArray to be used to fill the appropriate class.  
  ```kotlin
  // Kotlin Example
  val bytes = apiRequest(endpoint: Endpoint.GAMES, apicalypseQuery: "fields *;")
  val listOfGames: List<Games> = GamesResult.parseFrom(bytes).gamesList
  ```
  ```java
  // Java Example
  byte[] bytes = wrapper.apiRequest(endpoint: Endpoint.GAMES, apicalypseQuery: "fields *;");
  List<Game> listOfGames = GameResult.parseFrom(bytes).getGamesList();
  ```
  returns a list of Game objects.
  
* `apiJsonRequest`  
  This method return raw JSON (String) from the API  
  Example:  
  ```kotlin
  // Kotlin Example
  val json: String = apiJsonRequest(endpoint: Endpoint.GAMES, APICalypseQuery: "fields *;")
  ```
  ```java
  // Java Example
  String json = wrapper.apiJsonRequest(endpoint: Endpoint.GAMES, "fields *;");
  ```
  returns a String.
  
* `APICalypse`  
  ```kotlin
  // Kotlin Example
  val apicalypse = APICalypse()
        .fields("*")
        .exclude("*")
        .limit(10)
        .offset(0)
        .search("Halo")
        .sort("release_dates.date", Sort.ASCENDING)
        .where("platforms = 48")
  ```
  ```java
  // Java Example
  APICalypse apicalypse = new APICalypse()
                .fields("*")
                .exclude("*")
                .limit(10)
                .offset(0)
                .search("Halo")
                .sort("release_dates.date", Sort.ASCENDING)
                .where("platforms = 48");
  ```
  Here are all of the options, this creates a query for you. To get a String query from APICalypse just add `.buildQuery()`.
  
__NOTE__  
These examples above are only here to show you how to use the "manual" part of the wrapper. This wrapper comes with complete functions for each endpoint in the API :) so you dont have to deal with the manual stuff..

There are two functions for each endpoint, one for classes and one for json, for quick access. The difference between them is the name see the examples bellow:  
```kotlin
// Example of functions in Kotlin
IGDBWrapper.games(APICalypse())
IGDBWrapper.platforms(APICalypse())
IGDBWrapper.genres(APICalypse())
...
IGDBWrapper.jsonGames(APICalypse())
IGDBWrapper.jsonPlatforms(APICalypse())
IGDBWrapper.jsonGenres(APICalypse())
...
```
```java
// Example of functions in Java
ProtoRequestKt.games(IGDBWrapper.INSTANCE, new APICalypse())
ProtoRequestKt.platforms(IGDBWrapper.INSTANCE, new APICalypse())
ProtoRequestKt.genres(IGDBWrapper.INSTANCE, new APICalypse())
...
JsonRequestKt.jsonGames(IGDBWrapper.INSTANCE, new APICalypse())
JsonRequestKt.jsonPlatforms(IGDBWrapper.INSTANCE, new APICalypse())
JsonRequestKt.jsonGenres(IGDBWrapper.INSTANCE, new APICalypse())
...
```

## Exceptions
The wrapper thorws an `RequestException` on every exception from the API. This exception hold three things:
* HTTP status code
* Request (The complete sent request for debugging)
* Result (The response from the API)
Request and Response come directly from the HTTP library [Fuel](https://github.com/kittinunf/Fuel)
  
## Code Examples
* Request games from the API:
```kotlin
// Kotlin
IGDBWrapper.userKey = "YOUR_API_KEY"
val apicalypse = APICalypse().fields("*").sort("release_dates.date", Sort.DESCENDING)
try{
  val games: List<Game> = IGDBWrapper.games(apicalypse) 
} catch(e: RequestException) {
  // Do something or error
}
```
```java
// Java
IGDBWrapper wrapper = IGDBWrapper.INSTANCE;
wrapper.setUserkey("YOUR_API_KEY");
APICalypse apicalypse = new APICalypse().fields("*").sort("release_dates.date", Sort.DESCENDING);
try{
  List<Game> games = ProtoRequestKt.games(wrapper, apicalypse);
} catch(RequestException e) {
  // Do something or error
}
```
* Search in the API:
__NOTE__  
Search objects contain the objects from search ex: Characters, Collections, Games, People, Platforms, and Themes. 
```kotlin
// Kotlin
IGDBWrapper.userKey = "YOUR_API_KEY"
val apicalypse = APICalypse().search("Halo").fields("*")
    .sort("release_dates.date", Sort.DESCENDING)
try{
  val searchResult: List<Search> = IGDBWrapper.search(apicalypse) 
} catch(e: RequestException) {
  // Do something or error
}
```
```java
// Java
IGDBWrapper wrapper = IGDBWrapper.INSTANCE;
wrapper.setUserkey("YOUR_API_KEY");
APICalypse apicalypse = new APICalypse().search("Halo").fields("*")
    .sort("release_dates.date", Sort.DESCENDING);
try{
  List<Search> searchResult = ProtoRequestKt.search(wrapper, apicalypse);
} catch(RequestException e) {
  // Do something or error
}
```
* Request filtered results:
```kotlin
// Kotlin
IGDBWrapper.userKey = "YOUR_API_KEY"
val apicalypse = APICalypse().fields("*")
    .sort("release_dates.date", Sort.DESCENDING).where("themes != 42")
try{
  val games: List<Game> = IGDBWrapper.games(apicalypse) 
} catch(e: RequestException) {
  // Do something or error
}
```
```java
// Java
IGDBWrapper wrapper = IGDBWrapper.INSTANCE;
wrapper.setUserkey("YOUR_API_KEY");
APICalypse apicalypse = new APICalypse().fields("*")
    .sort("release_dates.date", Sort.DESCENDING).where("themes != 42");
try{
  List<Game> games = ProtoRequestKt.games(wrapper, apicalypse);
} catch(RequestException e) {
  // Do something or error
}
```
