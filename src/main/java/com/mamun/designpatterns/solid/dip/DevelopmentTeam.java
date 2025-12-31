package com.mamun.designpatterns.solid.dip;

public class DevelopmentTeam {

    VersionControl versionControl;

    public DevelopmentTeam(VersionControl versionControl) {
        this.versionControl = versionControl;
    }

    public void makeCommit(String message) {
        versionControl.commit(message);
    }

    public void performPush() {
        versionControl.push();
    }

    public void performPull() {
        versionControl.pull();
    }

}
