# hw_7_skunk
SEIS 635 HW 7: TDD with EGit/GitHub for Skunk - Repo


You will work with your team member(s) on this assignment. You will be graded on the work you do in class; later HW will continue the work started here.

The goals of this assignment are multifold:

(a) Start (or continue) a Java implementation of Skunk;
(b) Practice Test Driven Design (TDD) as a software development technique;
(c) Practice team coding work using EGit within Eclipse and a remote GitHub repository;
(d) Introduce the practice of pair programming, where one team member controls the keyboard and the others review and check his/her work;
(e) Use previously-developed CRC (Class-Responsibility-Collaborator) cards as a guide for design;
(f) Employ GRASP as a complementary technique for design;
(g) Learn how to use ECLEmma, an Eclipse plug-in that measures test code coverage;
(h) Install and learn how to use ObjectAid UML, another Eclipse plug-in for reverse-engineering software class diagrams.

We'll do the following together in class:

[1] Pick one of your team member's GitHub accounts, and create an empty repository named hw_7_skunk within it. Call this team member the 'host'. Add other team member's accounts as collaborators to the host's repo, along with my seis-635-fall2017 account. 

[2] Have each team member start Eclipse on their own PC, and configure it with their own Git credentials (GitHub name and email). They'll also have to accept the invitation to be a collaborator before you can continue, by logging onto their own GitHub account.

[3] Create an empty Eclipse Java project named 602_hw_7 on the host's PC for your Skunk implementation. Create a separate project source folder named test to contain your JUnit test cases. We started a Skunk TDD implementation in Class 7, so you may copy your previous code and tests into this new 602_hw_7 project, if you wish. Otherwise, you can start from scratch.

[4] Share the host's Eclipse project (Team->Share Project...), creating a local repository outside the workspace on the host's PC. If working on a classroom PC, think about locating your repo in a folder on your Desktop so you can find it later. If working on your own PC, remember where you locate the repo.

[5] Create the first class SkunkApp within your project. Then create a JUnit test case SkunkAppTest with its initial fail() test method for this class. Stage both new files ("Git add"), along with other files if you added them in Step [3] above, then do your first commit to the local repo. Don't forget to provide a commit message! Then push your commit to the empty GitHub repo under the host's account. Think about storing your GitHub logon credentials in Eclipse's secure storage, so you don't have to enter them over and over. Log onto the host's GitHub account, examine the repo and verify this first commit was successful.

[6] Now the other team member(s) should (each) clone the host's GitHub 602_hw_7 repo to their own local PC, whether classroom or laptop.  Each should copy the repo's URL by logging onto their own GitHub account, viewing and copying the shared host repo URL: you did remember to add all team members as collaborators, didn't you? Then do Import...->Git->Projects from Git->Clone URI and the URI in the clipboard should be automatically entered into the dialog.  Note that you don't need to log onto GitHub to clone the host repo, since it's a public repo - but entering and saving the Authentication info (GitHub username and password) into Eclipse's secure store will allow you to skip logging on to GitHub for each repo access in the future. 

[7] Now the TDD work can begin with "pair programming." One of the team members should begin as the one who controls the keyboard on their own PC (the "boss"), with the other reviewing their work on both code and tests. As work proceeds, the boss should commit regularly to their local repo.  Only push these commits to the remote host repo after each new test succeeds. Both author and committer here should be the boss.

[8] Remember the TDD procedure: (a) Write a failing test, with not compiling counting as a failure; (b) Write just enough code to make the test succeed; (c) Refactor both code and tests, removing duplication and improving readability.  Repeat! We'll cover (c) in more detail in Class 9...

[9] Continue with your TDD development of your SkunkApp and supporting classes.  Consult the previously-developed CRC for design suggestions if you wish, though you may find you are diverging from their original responsibilities and collaborators as you proceed. Keep GRASP in mind as you go. I'll occasionally ask a team to volunteer to share their work with the rest of the class via join.me, so we can discuss their designs with respect to GRASP and other concerns.

[10] After a while, the other team member should take over control of the keyboard, becoming the new boss.  They should log into their own account on a classroom PC or their own laptop, working in their own clone of the host's GitHub repo.  Since this remote repo now has committed changes beyond their original cloned version (upstream is ahead of the local repo), you'll have to pull the changes down to your local PC repository before continuing work.  We'll discuss how to do this in EGit (the Eclipse Git toolset) in class.
 
[11] As before, the boss commits changes regularly to the local PC repo.  Be sure the boss is both author and committer on all commits - which they should be if they configured correctly in Step [2].  Continue to push successful completion of new test commits up to the host GitHub repo, occasionally consulting the remote site web page to verify them.  By the end of class, each team members should have done multiple commits of completed work under their own GitHub id as author/committer to the remote GitHub repo.

[12] As you work, you'll find that the random nature of rolling dice makes it difficult to test your evolving SkunkApp.  Thus, consider adding some kind of "pre-programmed dice" mechanism to your dice designs, perhaps by initializing such dice with two int arrays, thus specifying the sequence of die values that should result when rolling such "loaded dice." Then you can create and initialize a game of Skunk that uses such dice for your tests, thus yielding specific roll sequences during the test game.  You can then compare expected behavior with the app's actual behavior in your tests using these dice. We'll discuss possible designs for such loaded dice in class. Don't forget to plan and write failing tests for your loaded dice *before* implementing them!

[13] Along the way, we'll see how to use Eclipse's ECLEmma, a coverage tool that's included with the standard Eclipse Java installation.  It allows you to measure and view how much of your app code is actually tested by your test code.  100% coverage is the goal, though I won't expect it for this HW. Later HW and Team Project assignments will also have you use this tool. Here's the ECLEmma site URL: http://www.eclemma.org/

[14] Another useful tool is the ObjectAid UML plug-in.  This tool allows you to reverse-engineer your source code, creating UML Class Diagrams within your Eclipse project.  It's not included in the standard Eclipse installation; you have to add it as an external tool and obtain a free external license to use it.  Here's how: http://www.objectaid.com/installation  Try installing it, then generating UML Class Diagrams for your SkunkApp code.  I'll show how in class.

Many other free tools exist for doing reverse-engineering of Java code.  We'll discuss some in class, but if you find your own examples, please share.

[15] If we have time at the end of class, we'll discuss workflow strategies for team coding work with EGit and GitHub - including how to deal with merge conflicts. We'll stage some examples showing how to handle these. Tutorial videos on such topics are in progress, so stay tuned...
 
[16] At the end of class, make sure you've committed and pushed all your code and tests to the host's GitHub repo.  Your code should have no syntax errors, and all tests should succeed.  If so, and if all team members have done commits, then all team members will earn full credit. No other submission is required.

I will grade this HW by cloning each of your host repos (you did add seis-635-fall2017 as a collaborator in Step [1], didn't you?) and making sure you've satisfied all the requirements.

You will continue working on this project for future HW assignments, so don't delete it...
