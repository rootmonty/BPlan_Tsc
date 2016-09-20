package badebaba.myapplication;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

import badebaba.myapplication.Firebase.LoginActivity;

/**
 * Created by badebaba on 9/18/2016.
 */
public class BottomMain extends AppCompatActivity {

    FirebaseAuth mauth;
    FirebaseAuth.AuthStateListener authListener;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        //firebase signout option
        mauth = FirebaseAuth.getInstance();

        //get current user
        final FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        authListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user == null) {
                    // user auth state is changed - user is null
                    // launch login activity
                    startActivity(new Intent(BottomMain.this, LoginActivity.class));
                    finish();
                }
            }
        };

        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottomBar);
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                if (tabId == R.id.general) {
                    // The tab with id R.id.tab_favorites was selected,
                    // change your content accordingly.
                    initialisefragment(tabId);
                } else if (tabId == R.id.staff) {
                    initialisefragment(tabId);

                } else {
                    initialisefragment(tabId);

                }
            }
        });
    }

    public void initialisefragment(int tabId) {
        Fragment fragment = null;
        switch (tabId) {
            case R.id.general:
                fragment = new General();
                break;
            case R.id.staff:
                fragment = new Staff();
                break;
            case R.id.teacher:
                fragment = new Teacher();
                break;
            default:
                break;
        }
        if (fragment != null) {
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.contentContainer, fragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();


        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }


    public void signOut() {
        mauth.signOut();
    }

    @Override
    protected void onResume() {
        super.onResume();
        // progressBar.setVisibility(View.GONE);
    }

    @Override
    public void onStart() {
        super.onStart();
        mauth.addAuthStateListener(authListener);
    }

    @Override
    public void onStop() {
        super.onStop();
        if (authListener != null) {
            mauth.removeAuthStateListener(authListener);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                Toast.makeText(getApplicationContext(), "Settings displayed", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_developer:
                Toast.makeText(getApplicationContext(), "Architected By DrManhattan", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_logout:
                mauth.signOut();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
