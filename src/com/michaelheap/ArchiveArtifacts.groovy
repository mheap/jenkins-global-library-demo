package com.michaelheap;
def execute(){
    node {
        dir('dist') {
            archiveArtifacts artifacts: '*.AppImage', fingerprint: true;
        }
    }
}
