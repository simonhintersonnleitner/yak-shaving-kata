@REM Licensed to the Apache Software Foundation (ASF) under one
@REM or more contributor license agreements.  See the NOTICE file
@REM distributed with this work for additional information
@REM regarding copyright ownership.  The ASF licenses this file
@REM to you under the Apache License, Version 2.0 (the
@REM "License"); you may not use this file except in compliance
@REM with the License.  You may obtain a copy of the License at
@REM
@REM    http://www.apache.org/licenses/LICENSE-2.0
@REM
@REM Unless required by applicable law or agreed to in writing,
@REM software distributed under the License is distributed on an
@REM "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
@REM KIND, either express or implied.  See the License for the
@REM specific language governing permissions and limitations
@REM under the License.

@if "%DEBUG%" == "" @echo off
@setlocal

set DIRNAME=%~dp0
if "%DIRNAME%" == "" set DIRNAME=.

set MVN_JAR=%DIRNAME%.mvn\wrapper\maven-wrapper.jar

if exist %MVN_JAR% (
  "%JAVA_HOME%\bin\java" -cp %MVN_JAR% org.apache.maven.wrapper.MavenWrapperMain %*
) else (
  echo Downloading maven-wrapper...
  for /f "tokens=2 delims==" %%a in ('findstr "wrapperUrl" %DIRNAME%.mvn\wrapper\maven-wrapper.properties') do set WRAPPER_URL=%%a

  setlocal enabledelayedexpansion
  if not exist "%DIRNAME%.mvn\wrapper" mkdir "%DIRNAME%.mvn\wrapper"

  powershell -Command "(New-Object Net.WebClient).DownloadFile('!WRAPPER_URL!', '%MVN_JAR%')"

  "%JAVA_HOME%\bin\java" -cp %MVN_JAR% org.apache.maven.wrapper.MavenWrapperMain %*
)

endlocal
