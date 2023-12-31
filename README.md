#### Just wanted to give a try for android app development. 

I just accepted the 30 days challenge by **Miss Saumya Singh**. Her 30+ android dev videos are available on [YouTube](https://youtube.com/playlist?list=PLTV_nsuD2lf4UCTV6xwvNPvFdmCNKyhc8&si=TeQeeUKgmylKG1Mx) for free. I will be updating here my day wise things learnings and practice materials. All my source codes will also be placed in this repo. I am super excited to start my android dev journey.

---

Day 01 (18th October 2023)

1. Downloaded and installed Android Studio from [here](https://developer.android.com/studio). I can see my installed app details as below :

~~~
Android Studio Giraffe | 2022.3.1 Patch 2
Build #AI-223.8836.35.2231.10811636, built on September 15, 2023
Runtime version: 17.0.6+0-b2043.56-10027231 amd64
VM: OpenJDK 64-Bit Server VM by JetBrains s.r.o.
Windows 10 10.0
GC: G1 Young Generation, G1 Old Generation
Memory: 1280M
Cores: 12
Registry:
    external.system.auto.import.disabled=true
    ide.text.editor.with.preview.show.floating.toolbar=false
~~~

2. Created `First Demo App` from a template kind of thing with name `Empty Activity`. It took 6-7 minutes for me for completed gradle build/sync.

3. Configured `Google Pixel 7` as my emulator. I downloaded `API 34` as my system image for the emulator. It was around 1.4 GB. And I noticed `Pixel 3a` was already available for me to use as emulator.

---
Day 02 (19th October 2023)

1. In [this 2nd video](https://youtu.be/oUYgLzmUl0o?si=3twinfVD6-GQYVB_) I got a nice overview / structural and components understanding of the Android Studio. I checked them out myself in my system. Tried navigating all the buttons / getting ready to make hand dirty!!!
2. In [this 3rd video](https://youtu.be/ppPX65NU7ko?si=-O4M1lgS0P24AOhK) I understood / learnt some Kotlin or I can say Android Dev things, created my first Android App (tried myself in my phone + shared with my friends as well). From [here](https://github.com/Krushna-Prasad-Sahoo/test-android/blob/main/high-low-app_19thOct2023.apk) the same app can be downloaded & tried. The name I have given as `high-low-app_19thOct2023.apk`. And don't worry, it don't have any virus hahah xD

---
Day 03 (20th October 2023)

1. In this [4th video](https://youtu.be/qllC71SYHz4?si=5xp9e-AKqDdPHz6b) I learnt and tried to build a simple interactive app. Where there will be 2 buttons (black & tale). If you click black, the app backgroud / layout will be black and the same goes for other button. It was simple and niceeee :)

---
Day 04 (21st October 2023)

1. In this [5th video](https://youtu.be/QltvZXWsba4?si=TcRAy_XnMuNOnbtD) I understood the concept of multiple Layouts such as `Constraint Layout`, `Linear Layout` & `Relative Layout`. I saw some of their example use cases & I feel after implementing or playing around that will make me realise the concept thoroughly.

---
Day 05 (22nd October 2023)

1. Some motivation from [this video](https://youtu.be/hzAgqLkyRX4?si=c8Eezu8mQDuZpnHk).
2. I have tried Java earlier, but truly its tough for me. And I never tried anything with Kotlin ever. And [this video](https://youtu.be/fgfQeclyZiU?si=prXuP2FGnUZYXQL8) inspires me to continue this android dev course (makes me feel better that I accepted this challenge) -- even if I am noob with these languages. #continuouslearning

---
Day 06 (24th October 2023)

1. In this [6th video](https://youtu.be/1sjA4e_wG3w?si=UCP77uTSp2o60Mg7) I came to know about the Android Activity Lifecycle. There are a core set of six callbacks: `onCreate()`, `onStart()`, `onResume()`, `onPause()`, `onStop()`, and `onDestroy()`. There we discussed one more called `onRestart()` as well. I quickly went through the [Android Developer Official Guide](https://developer.android.com/guide/components/activities/activity-lifecycle#kotlin) for more understanding on this concept. So well explained!

---
Day 07 (25th October 2023)

1. From this [7th video](https://youtu.be/RHFrA6QPWPQ?si=0Ke1yXwc7eSrrjf6) I understood the concept of `Text View` and `Scroll View`. Its so nice, I tried to implement in my Android Studio, got some error like `API 33` is not working, need `API 34`. Tried to rectify it, but I don't where I clicked mistakenly the view of my studio got changed. I am not feeling well today about that. But my app was ready. I had 2 images, some long paragraph under image1, so that text scrolling can be tested. Will try again after taking a nap. Will let you know how it goes!

2. On my next attempt after few hours break I could build the app and run on emulator (also tried in my phone). Unfortunately, the 2 images didn't show up this time, but text view was scrolling as expected. I will try again building the images only with some dummy text. Before that let me tell you where I rectified to resolve the issue.
  - Go to `AppName > app` -> click on that , you will see a file called `build.gradle.kts` -> open it
  - There I changed 2 values to 34 :
     - compileSdk = 34
     - targetSdk = 34
  - Then click `Sync now` -> wait for a minute & then build. It will be done successfully.

3. I tried only puting a single image in `LinerLayout` and it worked. Now I will try with some text -> then will try the same app I was trying before "some scrolling text sandwiched between two images".
4. In my next attempt it wokred 100% as expected. Some scrolling texts are sandwiched between 2 images. Though this app is not much interactive, only can be seen n text can be scrolled, I learnt something new and interesting.
5. One thing I noticed that I would like to highlight that in any dummy text if a `&` symbol stay, the studio throws an error. I don't know why, but by seeing the logs & error messages I could understand them. I changed all `&` into `and` -> then it worked perfectly.
6. From [here](https://github.com/Krushna-Prasad-Sahoo/test-android/blob/main/scroll-text-app_26thOct.apk) the final app `scroll-text-app_26thOct.apk` can be downloaded and tested.

---
Day 08 (26th October 2023)

1. Received some hints from [this video](https://youtu.be/1VuTaNbRkkQ?si=8wToZW_X4Hm9yWkG) on troubleshooting many issue while working in Android Studio. I'm already working on this ...

---
Day 09 (27th October 2023)

1. In this [8th video](https://youtu.be/47teINBTF08?si=zdxyRa6jX_5PW6p1) I understood a new concept. When we have use case such as when you click a button -> new app opens up or if you click a button & another page of the same app open up -> then in that case we have to use `Intents`. There are 2 types of Intents.
   - Explicit Intent : Explicit intents are used for communication inside the application. Like changing activities inside the application.
   - Implicit Intent : They are used for communication across two different applications.
2. I just loved it... I am truly amazed with the APP I created now after one hour work. Its size is 25 MB, so I am not able to upload it here in GitHub but yeah I will explain you how it works. So I have used the concept called `Explicit Intent`. So when you open my app -> it will show you a place picture & its name, below the picture you will see 3 buttons as `Visit XyZ` -> So when you click it you will be seeing another page with that place & 3 button below (to come back to the 1st place or to visit some different place) . I was so amazed because it worked in my first attempt without any errors.
3. I have a plan to create a homepage & keep thier 5 buttons to visit 5 different places. Every place will be available on different page with a image, some text on the place and a back button to come back to home page. Then I will share it with my family and friends. I will start from a scratch new project for this. I am so excited!

---
Day 10 (28th October 2023)

1. In [this video](https://youtu.be/gG7sqvJjLaE?si=95Qab813AqIDrOix) I got the commands to push the android projects to github repository. I was aware of this thing earlier and the commands as well. So it was a nice revision for me. I am working on the project that I mentioned yesterday, I will upload that in the same way - in a new repo.
2. First you need to download git/gitbash in your local setup. Then you can use git commands to push the project files after authenticating.
3. Sharing the commands below :

~~~    
- Check status : `git status`
- Initialise  : `git init`
- Add remote location with name `origin` : `git remote add origin https://github.com/<user_acc_name>/<repo_name>`
- Check remote location : `git remote`
- More details on remote location : `git remote -v`
- Put all files into staging area : `git add .`
- Check status : `git status`
- Save all changes : `git commit -m "Adding all project files"`
- Check status : `git status`
- Check branch : `git branch`
- Push to remote repo in `master` branch : `git push origin master`
~~~

---
Day 11 (29th October 2023)

1. It was a busy day for me. I haven't done any thing with respect to Android Dev today. Will first complete the yesterday's project. Then will continue learning new things.
2. The project is ready now! i.e <b>PlaceSage</b> is your gateway to India's finest destinations. Explore, discover, and uncover the treasures of Delhi, Mumbai, Kolkata, Bangalore, and Bhopal – all in one app.

---
Day 12 (1st November 2023)

1. From this [video](https://youtu.be/YVfBEowGBU8?si=T-rNdr2psH9reub8) I did learn about `Implicit Intent Concept` in Android. Implemented it as well. My app was working well on my phone, but the emulator on Android Studio was failing when the `camera` was opening or `chrome` browser was opening. It was not throwing any error, but I felt like it was getting restarted.
2. Also, I understrood another view called `CardView` and implemented that in this test.

---
Day 13 (3rd November 2023)

1. In this [video](https://youtu.be/VmPo5OV70yM?si=Ka38heiBVQEHxN_B) I got a new concept of `WebView`. It was really interesting. With this power I was able to make multiple website's clone mobile app in few minutes. And also I have few friend who have their personal website or portfolio. I gifted them with a mobile app of their portfolio or website. Hahaha xD. This was awesome.
2. Also in this video I came to know how to take user permission for _Internet_ and also I learnt how to create a function in Kotlin using `fun` keyword.

---
Day 14 (4th November 2023)

1. In this [video](https://youtu.be/a5tc0QALO-w?si=RryqSbnDHBWFzxCh) I received an idea (or better to say an assignment) to try and implement it. It uses all the concepts learned till now, incluing buttons, multiple views, explicit & implicit intents and to make the app little interactive. Need to find few things by own. Let's see when I can try it.
2. I am planning to add Implicit Intent concept in my previous project i.e `Place Sage` -> a simple button to call or send a mail kind of thing.
3. I did that yesterday (13th Nov) - button added, logic added, but sadly it not working. App is crashing upon pressing the call button. I am sad.

---
Day 15 (5th November 2023)

1. In this [13th video](https://youtu.be/kGb2aQV2H1c?si=FunHLTlL5tCl-0cI) I understood few concepts on how to capture user data, and pass them to another screen.
2. Implemented a small demo app - `Nothing Cafe` where user can pass some name of the food then press the _Order Now_ button, in the next page it will just show that orders placed.
3. During this mini app, I learnt about `companion object` concept, `toString()`, passing data via `key` and value in `intent.putExtra()` .

---
Day 16 (6th November 2023)

1. [This video](https://youtu.be/kGYOGJeBPhY?si=GEqsxJ9QZ8Q34IUw) was really great. A long one but worthy, learned a lot about `LogCat` - how to check the logs and troubleshoot, filtering out logs, adding tags in application code etc.
2. Secondly leanred and implemented another concept called `Splash Screen` using `Handler().postDelayed()` method.
3. Also, got a trick i.e to hide the action bar we can use `supportActionBar?.hide()` method.
4. Here the interesting thing(`?`) is used to handle the Null value (in case it is present). 

---
Day 17 (7th November 2023)

1. In [this video](https://youtu.be/7TyaGn0I2d0?si=FJ-JthYoJcRw5DWQ) I understood about `gradient` colour creation in Android Studio as per own requirement and how to use that as app background.
2. I learned and created a `vector assest` of a person, mail, password in `drawable` folder, implemented that on login page.
3. Nice colourfil login page created, will proceed further with next class. 
