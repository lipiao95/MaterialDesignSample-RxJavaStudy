package me.lipiao.material_design;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import me.lipiao.material_design.behavoir.BehaviorSimpleActivity;
import me.lipiao.material_design.behavoir.BottomSheetBehaviorActivity;
import me.lipiao.material_design.behavoir.CustomBehaviorActivity;
import me.lipiao.material_design.behavoir.CustomBehaviorActivity2;
import me.lipiao.material_design.behavoir.FABSimpleActivity;
import me.lipiao.material_design.bottomsheetdialog.BottomSheetDialogActivity;
import me.lipiao.material_design.cardview.CardViewSimpleActivity;
import me.lipiao.material_design.edit.TextInputSimpleActivity;
import me.lipiao.material_design.navigation.BottomNavigationActivity;
import me.lipiao.material_design.navigation.TabActivity;
import me.lipiao.material_design.navigation.TabActivity2;
import me.lipiao.material_design.toolbar.AppbarLayoutActivity;
import me.lipiao.material_design.toolbar.JanshuActivity;
import me.lipiao.material_design.toolbar.ToolbarActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_bottom_sheet).setOnClickListener(this);
        findViewById(R.id.btn_toolbar).setOnClickListener(this);
        findViewById(R.id.btn_appbar_layout).setOnClickListener(this);
        findViewById(R.id.btn_appbar_layout1).setOnClickListener(this);
        findViewById(R.id.swipe_btn).setOnClickListener(this);
        findViewById(R.id.custom_behavior).setOnClickListener(this);
        findViewById(R.id.custom_behavior2).setOnClickListener(this);
        findViewById(R.id.fab_snack_btn).setOnClickListener(this);
        findViewById(R.id.bottom_sheet_demo).setOnClickListener(this);
        findViewById(R.id.tab_layout_simple1).setOnClickListener(this);
        findViewById(R.id.tab_layout_simple2).setOnClickListener(this);
        findViewById(R.id.bottom_navigaiton_simple).setOnClickListener(this);
        findViewById(R.id.text_input_simple).setOnClickListener(this);
        findViewById(R.id.card_view_simple).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.btn_bottom_sheet:
                intent = new Intent(this, BottomSheetDialogActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_toolbar:
                intent = new Intent(this, ToolbarActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_appbar_layout:
                intent = new Intent(this, AppbarLayoutActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_appbar_layout1:
                intent = new Intent(this, JanshuActivity.class);
                startActivity(intent);
                break;
            case R.id.swipe_btn:
                intent = new Intent(this, BehaviorSimpleActivity.class);
                startActivity(intent);
                break;
            case R.id.custom_behavior:
                intent = new Intent(this, CustomBehaviorActivity.class);
                startActivity(intent);
                break;
            case R.id.custom_behavior2:
                intent = new Intent(this, CustomBehaviorActivity2.class);
                startActivity(intent);
                break;
            case R.id.fab_snack_btn:
                intent = new Intent(this, FABSimpleActivity.class);
                startActivity(intent);
                break;
            case R.id.bottom_sheet_demo:
                intent = new Intent(this, BottomSheetBehaviorActivity.class);
                startActivity(intent);
                break;
            case R.id.tab_layout_simple1:
                intent = new Intent(this, TabActivity2.class);
                startActivity(intent);
                break;
            case R.id.tab_layout_simple2:
                intent = new Intent(this, TabActivity.class);
                startActivity(intent);
                break;
            case R.id.bottom_navigaiton_simple:
                intent = new Intent(this, BottomNavigationActivity.class);
                startActivity(intent);
                break;
            case R.id.text_input_simple:
                intent = new Intent(this, TextInputSimpleActivity.class);
                startActivity(intent);
                break;
            case R.id.card_view_simple:
                intent = new Intent(this, CardViewSimpleActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
