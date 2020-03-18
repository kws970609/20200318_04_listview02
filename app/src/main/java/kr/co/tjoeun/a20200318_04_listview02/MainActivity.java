package kr.co.tjoeun.a20200318_04_listview02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import kr.co.tjoeun.a20200318_04_listview02.adapters.RoomAdater;
import kr.co.tjoeun.a20200318_04_listview02.databinding.ActivityMainBinding;
import kr.co.tjoeun.a20200318_04_listview02.datas.Room;

public class MainActivity extends BaseActivity {
    List<Room> roomDatas = new ArrayList<>();
    RoomAdater roomAdater = null;

    ActivityMainBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {
        roomAdater = new RoomAdater(mContext, R.layout.room_list_item, roomDatas);
        binding.roomListView.setAdapter(roomAdater);

        addRooms();
    }

    private void addRooms() {
        roomDatas.add(new Room(88000,"서울시 은평구", 4,"살기좋은 방입니다."));
        roomDatas.add(new Room(28000,"서울시 노원구", 20,"노원구 아파트."));
        roomDatas.add(new Room(38000,"서울시 종로구", 12,"종로구의 펜트하우스."));
        roomDatas.add(new Room(48000,"경기도 고양시", 0,"고양시 반지하."));
        roomDatas.add(new Room(68000,"경기도 부천시", -1,"부천시 주택."));

        roomAdater.notifyDataSetChanged();

    }


}
