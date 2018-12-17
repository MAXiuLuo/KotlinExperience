# KotlinExperience
Google宣布Kotlin成为Android开发的官方语言，习惯用java开发Android的小伙伴们，这下懵逼了
##  掀开kotlin的神秘,常量定义，var和val
```
    var a: Int = 1  // 立即赋值为Int类型的a
    val b = 2   // 自动推断出 `Int` 类型
    val TAG = "MainActivity";
    
    //var，变量
    //val不可变量
    
   @JvmField //静态，不可修饰，相当java内的static final，@JvmField修饰的属性不会自动生成setter/getter函数
   val VISIBLE: Int = 99
   @JvmStatic //静态，相当java内的static被
   val INVISIBLE: Int = 66
   
```
## 方法定义

```
    /*
     * 方法名：Sum
     * 参数Int类型，a
     * 参数Int类型，b
     * 返回类型为Int类型
     */
    fun Sum(a: Int, b: Int): Int {
        return a + b
    }

    //函数的默认参数
    fun Sum(a: Int = 0, b: Int = 1, c: Int = 2): Int {
        return a + b + c
    }

    //在子类里重写父类的方法需要使用override关键字描述方法，接口监听按键方法
    override fun onClick(view: View?) {
        when (view?.id) {
            //View.id
        }
    }

```
##  kotlin
```
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        //import kotlinx.android.synthetic.main.activity_main.*  导包
        HelloTextView.text = "剔除了findViewById()方法的调用";
        
        //kotlin可以直接调用接口内的成员变量，isOk和Number都是接口的成员变量
        if (isOk) {
            Log.d("是否进入判断体 = " + isOk, "接口内的数字是 = " + Number)
        }
    }
    //更多细节内容，可以看代码，这里就不一一举例了
```
