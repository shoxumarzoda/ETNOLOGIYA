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

        modelViewPagerList.add(new ModelViewPager(R.drawable.a10,"Muqaddima","XXI asr o‘zbеk xalqi o‘z tarixi va milliy an’analar ...","file:///android_asset/Kirish.htm"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.a1,"I BОB. ETNOLOGIYANING IJTIMOIY FANLAR  TIZIMIDA TUTGAN O‘RNI. UNING ASOSIY TUSHUNCHALARI VA O‘ZIGA XOSLIGI","Harqan day fanning fan sifatida shakllanishi ...",""));
        modelViewPagerList.add(new ModelViewPager(R.drawable.a2,"II BОB. ETNOLOGIYANING ASOSIY  YO‘NALISHLARI VA MAKTABLARI","Harqan day fanning fan sifatida shakllanishi ...",""));
        modelViewPagerList.add(new ModelViewPager(R.drawable.a3,"III BOB. ETNOS MUAMMOSI BILAN BOG‘LIQ QARASHLAR VA NAZARIYALAR","Harqan day fanning fan sifatida shakllanishi ...",""));
        modelViewPagerList.add(new ModelViewPager(R.drawable.a4,"IV BOB. DUNYONING ETNIK MANZARASI VA ETNOSLAR KLASSIFIKATSIYASI","Harqan day fanning fan sifatida shakllanishi ...",""));





    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}