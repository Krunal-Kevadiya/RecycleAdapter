[![API](https://img.shields.io/badge/API-16%2B-red.svg?style=flat)](https://android-arsenal.com/api?level=16)
[![Build Status](https://travis-ci.org/wupdigital/android-maven-publish.svg?branch=master)](https://github.com/Krunal-Kevadiya/RecycleAdapter)
[ ![Download](https://api.bintray.com/packages/kevadiyakrunalk/MyFramework/recycleviewadapter/images/download.svg) ](https://bintray.com/kevadiyakrunalk/MyFramework/recycleviewadapter/_latestVersion) 
[![License](https://img.shields.io/badge/License-Apache%202.0-orange.svg)](https://opensource.org/licenses/Apache-2.0)

# RecycleAdapter

* in this feature you can create adapter with any type of data using single line of code.
* and provide the onclick, onlongclick of rootview and also you can apply individual view based on ResId.
* you will get onBind listener if required for any further customisation as per your requirements.
* set load more listener for on demand based data load.
* also provide the custom layout handler as per your requirements.
* both side swipe menu support.
* multiple layout support (header, footer, customs xml etc).
* Also I used databinding concept, so don’t worry about null value :) 
* Code :-
```java   
/*
      with -> first argument is your list and second argument is your binding object but remind to you, your all list item
              layout file in same binding name define like  
              <data>
                 <variable name="item" type="pojo class path" /> 
              </data>
      map -> here i am set two list item one is header and second is point, so it will automatically handle the layout file
             bind in list based on your give class.   
*/      
```
-> Gradle
```groovy
//add dependencies for app level build.gradle
repositories {
    jcenter()
}
dependencies {
  compile 'com.kevadiyakrunalk:recycleadapter:2.0@aar'
}
```
-> Maven
```xml
<dependency>
  <groupId>com.kevadiyakrunalk</groupId>
  <artifactId>recycleadapter</artifactId>
  <version>2.0</version>
  <type>pom</type>
</dependency>
```
