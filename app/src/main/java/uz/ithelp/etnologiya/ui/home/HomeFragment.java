package uz.ithelp.etnologiya.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

import uz.ithelp.etnologiya.ModelViewPager;
import uz.ithelp.etnologiya.ModelViewPagerAdapter;
import uz.ithelp.etnologiya.R;
import uz.ithelp.etnologiya.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    ViewPager viewPager;
    ModelViewPagerAdapter modelViewPagerAdapter;

    List<ModelViewPager> modelViewPagerList;


    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        modelViewPagerList = new ArrayList<>();
        initiali();

        modelViewPagerAdapter = new ModelViewPagerAdapter(modelViewPagerList,getContext());

        viewPager = binding.viewPager1;
        viewPager.setAdapter(modelViewPagerAdapter);
        viewPager.setPadding(130,0,130,0);



        return root;
    }

    private void initiali() {

        modelViewPagerList.add(new ModelViewPager(R.drawable.a10,"Muqaddima","BIRINCHI QISM. ETNOLOGIYANING UMUMIY MUAMMOLARI ...","https://github.com/shoxumarzoda/ETNOLOGIYA/raw/master/muqqadima.pdf"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.a1,"I BОB. ETNOLOGIYANING IJTIMOIY FANLAR  TIZIMIDA TUTGAN O‘RNI. UNING ASOSIY TUSHUNCHALARI VA O‘ZIGA XOSLIGI","Etnologiyaning fan sifatida shakllanish tarixi ...","1"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.a2,"II BОB. ETNOLOGIYANING ASOSIY  YO‘NALISHLARI VA MAKTABLARI","Evolyutsionizm va diffuzionizm ...","2"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.a3,"III BOB. ETNOS MUAMMOSI BILAN BOG‘LIQ QARASHLAR VA NAZARIYALAR","Etnos va etniklik ...","3"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.a4,"IV BOB. DUNYONING ETNIK MANZARASI VA ETNOSLAR KLASSIFIKATSIYASI","Yer yuzi aholisi etnik tarixi ...","4"));





    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}