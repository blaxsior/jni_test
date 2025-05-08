cmake_minimum_required(VERSION 3.10)
project(MyJNIProject CXX)

# Java 설치 경로 지정
set(JAVA_HOME /usr/lib/jvm/java-21-openjdk-amd64)

# JNI 헤더 경로 추가
include_directories(
    ${JAVA_HOME}/include
    ${JAVA_HOME}/include/linux
    ${PROJECT_SOURCE_DIR}/include
)

# 소스 파일 모음
file(GLOB SOURCES "src/*.cpp")

# 공유 라이브러리 빌드
add_library(myjni SHARED ${SOURCES})

# 출력 파일 이름 지정 (리눅스: libmyjni.so)
set_target_properties(myjni PROPERTIES OUTPUT_NAME "myjni")