## CountDownTimerFlow

An Android library written in Kotlin that wraps the CountDownTimer in [LiveData](https://developer.android.com/reference/kotlin/androidx/lifecycle/LiveData).  Inspired by **[CountDownTimerFlow](https://github.com/ThanosFisherman/CountDownTimerFlow)** and [RxCountDownTimer](https://github.com/wardellbagby/RxCountDownTimer)



## Dependecy

Just copy the TimerLive class into your project.



## Usage

Observer from the view. 

```kotlin
TimerLive.create(30000, 1000).observe(this) {
  binding.title.text = it.toString()
}
```

## 

## License

[![License](https://camo.githubusercontent.com/407f2e25e126cc79d7fbe097734f69593ba3385c22132b81dadc1e9ef2455c43/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f6c6963656e73652d417061636865253230322d3445423142412e7376673f7374796c653d666c61742d737175617265)](https://www.apache.org/licenses/LICENSE-2.0.html)

```
Copyright 2022 Rawand Saeed

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
