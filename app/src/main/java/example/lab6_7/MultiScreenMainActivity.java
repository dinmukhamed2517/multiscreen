package example.lab6_7;



import android.os.Bundle;
import android.view.View;
import android.app.ListActivity;
import android.content.Intent;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class MultiScreenMainActivity extends ListActivity {
    String[] carChoices = {"Car 1", "Car 2", "Car 3", "Car 4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, carChoices);
        setListAdapter(adapter);

        OnItemClickListener itemListener = new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(MultiScreenMainActivity.this, Car1Activity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(MultiScreenMainActivity.this, Car2Activity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(MultiScreenMainActivity.this, Car3Activity.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(MultiScreenMainActivity.this, Car4Activity.class);
                        startActivity(intent3);
                        break;
                }

                Toast.makeText(getApplicationContext(), "You selected " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
            }
        };

        getListView().setOnItemClickListener(itemListener);
    }
}
