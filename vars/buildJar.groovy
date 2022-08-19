#!/usr/bin/ev groovy

def call(){

    echo "Building the application...."
    sh 'mvn package'
}
