# Dependencies & Instructions
## Website
1. Install python [here](https://www.python.org/downloads/), I am using version 3.13.2
2. Install flask by following the directions [here](https://flask.palletsprojects.com/en/stable/installation/)
running `~\teamProjects2App\AutoWeb\script.py` should now show
```
 * Serving Flask app 'script'
 * Debug mode: on
WARNING: This is a development server. Do not use it in a production deployment. Use a production WSGI server instead.
 * Running on http://127.0.0.1:5000
Press CTRL+C to quit
 * Restarting with stat
 * Debugger is active!
 * Debugger PIN: 606-743-160`
```
Double check the flask server is working by entering `http://127.0.0.1:5000` in your browser
The images in `~\teamProjects2App\AutoWeb\static\images` should appear

3. Follow the instructions to download ngrok [here](https://dashboard.ngrok.com/signup?ref=home-hero) or click "get started for free at [https://ngrok.com/](https://ngrok.com/)
4. Link you auth token to ngrok through the websites instruction and establish a static ip
the static ip in my example is `https://skink-helping-deadly.ngrok-free.app/`
5. Run both the python app and ngrok with
```
ngrok http --url=skink-helping-deadly.ngrok-free.app 5000
```
You should now be able to connect to the website by entering the static url in your browser

## Android App
1. Install Android Studio [here](https://developer.android.com/studio), I am using Android Studio Meerkat | 2024.3.1 Patch 1
2. Open the entire folder `~\teamProjects2App\AndroidApp` in android studio
3. Update gradle to its latest version by going to Tools -> AGP Upgrade Assistant, I am using Android Gradle Plugin version 8.9.1
4. Change the code at line 51 to your ngrok static ip
```
fun MyScreen() {
    MyWebView(url = "<your ngrok domain here>")
}
```
5. Run the app on an android device, it does not work on the simulator, it may ask you to refresh on first connect
