#!/usr/bin/env groovy

package com.michaelheap;

def run(Object step){
    try {
        step.execute();
    } catch (err) {
        currentBuild.result = "FAILURE"
        error(message)
    }
}

def execute() {
    this.run(new Checkout());
    this.run(new InstallDeps());
    this.run(new Test());
    this.run(new Lint());
    this.run(new Build());
}

return this;
