package uz.ithelp.etnologiya;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity implements UserAdapter.SelectedUser {

    Toolbar toolbar;
    RecyclerView recyclerView;
    List<ModelRcycler> modelRcyclers = new ArrayList<>();
    TextView textViewSelectedChapterName;

    int getChemgeItemPosition;

    ConstraintLayout constraintLayout;
    UserAdapter userAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();

        // ruyhatni eloni va sozlanmasi
        recyclerView = findViewById(R.id.recyclerView1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));



        // tool bar sozlanmasi
        toolbar = findViewById(R.id.toolBAr);
        this.setSupportActionBar(toolbar);
        this.getSupportActionBar().setTitle("");

        // tanlangan chapter nomini activity2 da sarlavhaga yozish
        textViewSelectedChapterName = findViewById(R.id.textViewSelectedChapterName);


        getChemgeItemPosition = intent.getIntExtra("swimmers",1);


        //backround uchun liner layoutni aniqlash
        constraintLayout = findViewById(R.id.constraintLayout1);
        constraintLayout.setBackgroundColor(getResources().getColor(R.color.mycolor));

        switch (getChemgeItemPosition){
            case 1: {

                textViewSelectedChapterName.setText("I BОB. ETNOLOGIYANING IJTIMOIY FANLAR  TIZIMIDA TUTGAN O‘RNI. UNING ASOSIY TUSHUNCHALARI VA O‘ZIGA XOSLIGI");

                modelRcyclers.add(new ModelRcycler("1-§. Etnologiyaning fan sifatida shakllanish tarixi","https://github.com/shoxumarzoda/ETNOLOGIYA/raw/master/1.1.pdf"));
                modelRcyclers.add(new ModelRcycler("2-§. Etnologiya fani predmeti ","https://github.com/shoxumarzoda/ETNOLOGIYA/raw/master/1.2.pdf"));
                modelRcyclers.add(new ModelRcycler("3-§. Etnologiya metodlari","https://github.com/shoxumarzoda/ETNOLOGIYA/raw/master/1.3.pdf"));
                modelRcyclers.add(new ModelRcycler("4-§. Etnologiyaning boshqa fanlar bilan aloqalari","https://github.com/shoxumarzoda/ETNOLOGIYA/raw/master/1.4.pdf"));
                modelRcyclers.add(new ModelRcycler("5-§. O‘zbekistonda etnologiya fani: yutuqlar, muammolar va rivojlanish istiqbollari","https://github.com/shoxumarzoda/ETNOLOGIYA/raw/master/1.5.pdf"));

            }break;
            case 2: {

                textViewSelectedChapterName.setText("II BОB. ETNOLOGIYANING ASOSIY  YO‘NALISHLARI VA MAKTABLARI");

                modelRcyclers.add(new ModelRcycler("6-§. Evolyutsionizm va diffuzionizm","https://github.com/shoxumarzoda/ETNOLOGIYA/raw/master/2.6.pdf"));
                modelRcyclers.add(new ModelRcycler("7-§. Sotsiologiya maktabi va funksionalizm","https://github.com/shoxumarzoda/ETNOLOGIYA/raw/master/2.7.pdf"));
                modelRcyclers.add(new ModelRcycler("8-§. Etnopsixologiya maktabining shakllanishi","https://github.com/shoxumarzoda/ETNOLOGIYA/raw/master/2.8.pdf"));
                modelRcyclers.add(new ModelRcycler("9-§. Etnologiyadagi yangi konsepsiyalar","https://github.com/shoxumarzoda/ETNOLOGIYA/raw/master/2.9.pdf"));


            }break;

            case 3: {

                textViewSelectedChapterName.setText("III BOB. ETNOS MUAMMOSI BILAN BOG‘LIQ QARASHLAR VA NAZARIYALAR");

                modelRcyclers.add(new ModelRcycler("10-§. Etnos va etniklik","https://github.com/shoxumarzoda/ETNOLOGIYA/raw/master/3.10.pdf"));
                modelRcyclers.add(new ModelRcycler("11-§. Primordializm va konstruktivizm","https://github.com/shoxumarzoda/ETNOLOGIYA/raw/master/3.11.pdf"));
                modelRcyclers.add(new ModelRcycler("12-§. Etnogenez va etnik tarix","https://github.com/shoxumarzoda/ETNOLOGIYA/raw/master/3.12.pdf"));

            }break;
            case 4: {

                textViewSelectedChapterName.setText("IV BOB. DUNYONING ETNIK MANZARASI VA ETNOSLAR KLASSIFIKATSIYASI");

                modelRcyclers.add(new ModelRcycler("13-§. Yer yuzi aholisi etnik tarixi","https://github.com/shoxumarzoda/ETNOLOGIYA/raw/master/3.13.pdf"));
                modelRcyclers.add(new ModelRcycler("14-§. XX asrdagi etnodemografik jarayonlar","https://github.com/shoxumarzoda/ETNOLOGIYA/raw/master/3.14.pdf"));
                modelRcyclers.add(new ModelRcycler("15-§. Dunyo aholisining geografik va antropologik klassifikatsiyasi","https://github.com/shoxumarzoda/ETNOLOGIYA/raw/master/3.15.pdf"));
                modelRcyclers.add(new ModelRcycler("16-§. Lingvistik klassifikatsiyalash","https://github.com/shoxumarzoda/ETNOLOGIYA/raw/master/3.16.pdf"));


            }break;
            case 5:{
                textViewSelectedChapterName.setText("V BOB. ETNOS VA MADANIYAT");

                modelRcyclers.add(new ModelRcycler("17-§. Madaniyat va uning etnik funksiyasi","https://github.com/shoxumarzoda/ETNOLOGIYA/raw/master/4.17.pdf"));
                modelRcyclers.add(new ModelRcycler("18-§. Etnik madaniyat","https://github.com/shoxumarzoda/ETNOLOGIYA/raw/master/4.18.pdf"));
                modelRcyclers.add(new ModelRcycler("19-§. Zamonaviy dunyo madaniyati va etnik madaniyat","https://github.com/shoxumarzoda/ETNOLOGIYA/raw/master/4.19.pdf"));
                modelRcyclers.add(new ModelRcycler("20-§. Milliy madaniyat. An’ana, urfodat va marosimlar","https://github.com/shoxumarzoda/ETNOLOGIYA/raw/master/4.20.pdf"));
                modelRcyclers.add(new ModelRcycler("21-§. O‘zbek milliy mentaliteti","https://github.com/shoxumarzoda/ETNOLOGIYA/raw/master/4.21.pdf"));
            }

        }

        userAdapter  = new UserAdapter(modelRcyclers,  this);
        recyclerView.setAdapter(userAdapter);

    }

    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        MenuItem menuItem = menu.findItem(R.id.search_view);

        SearchView searchView = (SearchView)menuItem.getActionView();
        searchView.setMaxWidth(Integer.MAX_VALUE);


        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                userAdapter.getFilter().filter(newText);
                return true;
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id   = item.getItemId();
        if (id == R.id.search_view) return true;
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void selectedUser(ModelRcycler modelRcycler) {
        startActivity(new Intent(MainActivity2.this, MainActivity3.class).putExtra("data",modelRcycler.getLoadUrl()));

    }
}