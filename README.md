AndroidTestIntegration
======================

#####Android test integration for android studio with debugger

###### It has 3 main components as junit, espresso, cobertura.


* Junit is popular library for java unit test.
* Espresso is android ui test framework.
* Cobertural is java test coverage tool.
* All of them run with gradle.


How to use
======================

###### Run unit test using junit
```
./gradle test
```
* After unit test, you can see reports at ```${projectDir}/test_reports```
* There are two reports. 1. JUnit, 2. Coverage


###### Run android UI test using espresso
```
./gradle connectedAndroidTest
```

Developed By
============

* Jung Kyungho - <moltak@gmail.com>


License
=======

    Copyright 2015 Jung Kyungho

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
