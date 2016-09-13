# Nimbl3 Android Teset

## Include Lib
- dagger2 (Depency Injector)
- retrofit2 (Http Service)
- picasso (Image Helper)
- timber (Logger)
- butterknife (View Binding)

## Methodology
- MVP Desgin (Seperate View , Model , Presenter( middle ware of view and model )
- Using Depency Injection to create every inject object as singleton module
- Create base and inject every compoent
- Hack indicator normaly indicator support only horizontal but for this app need to be vertical
- Create vertical viewpager
- Didn't Use pagination because in android ViewPager component need to initialize just one time
- Fragment handle saveinstance state
- ETC.. question please ask.