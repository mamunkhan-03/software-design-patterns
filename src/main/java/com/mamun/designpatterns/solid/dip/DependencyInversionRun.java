package com.mamun.designpatterns.solid.dip;

public class DependencyInversionRun {

    public static void run (){
        GitVersionControl git = new GitVersionControl();
        DevelopmentTeam team = new DevelopmentTeam(git);

        team.makeCommit("Initial commit");
        team.performPush();
        team.performPull();
    }
}
