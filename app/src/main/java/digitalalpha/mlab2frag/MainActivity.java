package digitalalpha.mlab2frag;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    ContactFragment cFrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //AboutFragment aboutFragment = new AboutFragment();
        //ContactFragment contactFragment = new ContactFragment();

        //FragmentManager fm = getSupportFragmentManager();
        //FragmentTransaction ft = fm.beginTransaction();

        //ft.add(R.id.fContact, contactFragment);
        //ft.commit();

        //ft.add(R.id.fAbout,aboutFragment);
        //ft.commit();


    }

    @Override
    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        return super.onCreateView(parent, name, context, attrs);

    }


}
