[![](https://jitpack.io/v/husnjak/IGDB-API-JVM.svg)](https://jitpack.io/#husnjak/IGDB-API-JVM)
# IGDB API-JVM (V3)
A Kotlin wrapper for the IGDB.com Video Game Database API. 

__IMPORTANT__

This wrapper is compatible with ONLY their newest release V3.

## About IGDB
One of the principles behind IGDB.com is accessibility of data. We wish to share the data with anyone who wants to build cool video game oriented websites, apps and services. This means that the information you contribute to IGDB.com can be used by other projects as well.

Thus, you are not only contributing to the value of this site but to thousands of other projects as well. We are looking forward to see what exciting game related projects you come up with. Happy coding!

More info here:
* [About the API](https://www.igdb.com/api)
* [API Documentation](https://api-docs.igdb.com/)

Information about the Querying language APICalypse:
* [apicalypse.io](https://apicalypse.io/)

## About the wrapper
This wrapper is written in Kotlin which uses the JVM and works with both Koltin & Java projects. I have not tested it on other JVM languages but it should work for these languages as well. The examples below showcase this wrapper in both Kotlin and Java.

Feel free to test it on other languages yourselves :)

The Wrapper can handle both the IGDB generated classes and JSON (Strings), I have chosen to make the API's Generated classes ([Protocol Buffers](https://developers.google.com/protocol-buffers/)) the standard way because it will make it easier to use as you don't have to create your own classes to hold the information.

# Installation and setup

__Maven__

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependency>
    <groupId>com.github.husnjak</groupId>
    <artifactId>IGDB-API-JVM</artifactId>
    <version>0.7</version>
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
    implementation 'com.github.husnjak:IGDB-API-JVM:0.7'
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
The wrapper has two "wrapping" functions and a lot of helper functions (one for each endpoint..)  
The two main functions are called `apiRequest` and `apiJsonRequest` and they handle all of the requests to the api.  
The class `APICalypse` handles the new querying language, so that you don't need to care about structure and syntax as much.

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
These examples above are only here to show you how to use the "manual" part of the wrapper. This wrapper comes with complete functions for each endpoint in the API :) so you don't have to deal with the manual stuff..

There are two functions for each endpoint, one for classes and one for json, for quick access. The difference between them is the name see the examples below:  
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

## ImageBuilder
To simplify the process of building the image URLs for IGDB images there is a new function called `imageBuilder` which is a helping tool in requesting the perfect sized images for your project. The function requires you to get the `image_id` then set your desired size (resolution), set your desired image format (default is set to PNG).  
```kotlin
// Kotlin Example
val image_id = "mnljdjtrh44x4snmierh"
val imageURL = imageBuilder(image_id, ImageSize.SCREENSHOT_HUGE, ImageType.PNG)

/*
* Result: 
* imageURL = https://images.igdb.com/igdb/image/upload/t_screenshot_huge/mnljdjtrh44x4snmierh.png
*/
```

```java
// Java Example
String image_id = "mnljdjtrh44x4snmierh";
String imageURL = ImageBuilderKt.imageBuilder(image_id, ImageSize.SCREENSHOT_HUGE, ImageType.PNG)

/*
* Result: 
* imageURL = https://images.igdb.com/igdb/image/upload/t_screenshot_huge/mnljdjtrh44x4snmierh.png
*/
```
More information about images can be found [here](https://api-docs.igdb.com/#images)
## Exceptions
The wrapper throws an `RequestException` on every exception from the API. This exception hold three things:
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
