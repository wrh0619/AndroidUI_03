# AndroidUI_03
题目：<br>
使用XML定义菜单<br>
 字体大小（有小，中，大这3个选项；分
别对应10号字，16号字和20号字）；<br>
点击之后设置测试文本的字体<br>
 普通菜单项，点击之后弹出Toast提示<br>
 字体颜色（有红色和黑色这2个选项），
点击之后设置测试文本的字体<br>
实验截图：<br>
![image](https://github.com/wrh0619/AndroidUI_03/blob/master/images/03.JPG)<br>
关键代码：
menu.xml
```
<?xml version="1.0" encoding="utf-8"?>
 <menu xmlns:android="http://schemas.android.com/apk/res/android">
 <item
     android:title="字体大小"
     >
     <menu>
         <group >
             <item
                 android:id="@+id/font_10"
                 android:title="10号字"/>
             <item
                 android:id="@+id/font_16"
                 android:title="16号字"/>
             <item
                 android:id="@+id/font_20"
                 android:title="20号字"/>
         </group>
     </menu>
 </item>
 <item
    android:id="@+id/plain_item"
    android:title="普通菜单项"/>


 <item
     android:title="字体颜色"
     >
     <menu>
         <group>
             <item
                 android:id="@+id/red_font"
                 android:title="红色" />
             <item
                 android:title="黑色"
                 android:id="@+id/black_font"/>
         </group>
    </menu>
</item>
 </menu>

```
activity_main.xml
```
  xmlns:android="http://schemas.android.com/apk/res/android"
     xmlns:app="http://schemas.android.com/apk/res-auto"
     xmlns:tools="http://schemas.android.com/tools"
     android:layout_width="match_parent"
     android:layout_height="match_parent"
     android:orientation="vertical"
     tools:context=".MainActivity">


     <EditText
         android:id="@+id/text"
         android:layout_width="wrap_content"
         android:layout_height="wrap_content"
         android:hint="用于测试的内容"
         />
```
MainActivity.java
```
public class MainActivity extends AppCompatActivity {
     EditText editText;
     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         editText = findViewById(R.id.text);
     }
     @Override
     public boolean onCreateOptionsMenu(Menu menu) {
         this.getMenuInflater().inflate(R.menu.menu,menu);
         return true;
     }
     @Override
     public boolean onOptionsItemSelected(MenuItem item) {
         switch (item.getItemId()) {
             case R.id.font_10:
                 editText.setTextSize(10*2);
                 break;
             case R.id.font_16:
                 editText.setTextSize(16*2);
                 break;
             case R.id.font_20:
                editText.setTextSize(20*2);
                 break;
             case R.id.plain_item:
                 Toast.makeText(this, "普通菜单项", Toast.LENGTH_SHORT).show();
                 break;
             case R.id.red_font:
                 editText.setTextColor(Color.RED);
                 break;
             case R.id.black_font:
                 editText.setTextColor(Color.BLACK);
                 break;
         }
         return true;
     }
 }

```
