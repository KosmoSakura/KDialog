package cos.mos.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import cos.mos.kdialog.UDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onBtnClick(View view) {
        switch (view.getId()) {
            case R.id.b1://消息正文+单个按钮
                UDialog.builder(this, "消息正文内容消息正文内容消息正文内容消息正文内容").build();
                break;
            case R.id.b2://消息正文+两个按钮
                UDialog.builder(this, "消息正文内容消息正文内容消息正文内容消息正文内容")
                    .button()
                    .build();
                break;
            case R.id.b3://消息正文+标题
                UDialog.builder(this, "今天放假")
                    .title("通知通知")
                    .build();
                break;
            case R.id.b4://消息正文+图标
                UDialog.builder(this, "上面有个圈圈")
                    .icon(R.mipmap.ic_launcher_round)
                    .build();
                break;
            case R.id.b5://消息正文+输入框
                UDialog.builder(this, "输入密码")
                    .input("这个是密码", true)
                    .button("确定", "取消")
                    .cancelClick(dia -> {
                        toast("操作已取消");
                        dia.dismiss();
                    })
                    .confirmClick((result, dia) -> {
                        toast("输入密码为：" + result);
                        dia.dismiss();
                    })
                    .build();
                break;
            case R.id.b6://全部显示
                UDialog.builder(this)
                    .title("我是个标题")
                    .icon(R.mipmap.ic_launcher_round)
                    .msg("我是消息正文")
                    .input("输入点什么")
                    .button("按钮一", "按钮二")
                    .build();
                break;
        }
    }

    private void toast(String str) {
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }
}
