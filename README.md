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
6. 
