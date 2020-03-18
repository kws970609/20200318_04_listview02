package kr.co.tjoeun.a20200318_04_listview02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import kr.co.tjoeun.a20200318_04_listview02.databinding.ActivityRoomDetailBinding;

public class RoomDetailActivity extends BaseActivity {

    ActivityRoomDetailBinding binding = null;

    public RoomDetailActivity() {
    }

    public ActivityRoomDetailBinding getBinding() {
        return binding;
    }

    public void setBinding(ActivityRoomDetailBinding binding) {
        this.binding = binding;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_room_detail);


    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

    }
}
