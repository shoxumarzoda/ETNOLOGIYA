package uz.ithelp.etnologiya.ui.gallery;

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
import uz.ithelp.etnologiya.databinding.FragmentGalleryBinding;
import uz.ithelp.etnologiya.ui.home.ModelViewPager;
import uz.ithelp.etnologiya.ui.home.ModelViewPagerAdapter;

public class GalleryFragment extends Fragment {


    ViewPager viewPager;
    ModelViewPagerAdapter modelViewPagerAdapter;

    List<ModelViewPager> modelViewPagerList;

    private FragmentGalleryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        modelViewPagerList = new ArrayList<>();
        initiali();

        modelViewPagerAdapter = new ModelViewPagerAdapter(modelViewPagerList,getContext());

        viewPager = binding.viewPager2;
        viewPager.setAdapter(modelViewPagerAdapter);
        viewPager.setPadding(130,0,130,0);


        return root;
    }

    private void initiali() {

        modelViewPagerList.add(new ModelViewPager(R.drawable.a9,"VI BОB. AVSTRALIYA VA OKEANIYA XALQLARI","IKKINCHI QISM. JAHON XALQLARINING ETNOLOGIK TAVSIFI ...","file:///android_asset/Kirish.htm"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.a11,"VII BОB. OSIYO XALQLARI  ETNOLOGIYASI","Osiyo xalqlarining tarixiy-etnologik tavsifi  ...",""));
        modelViewPagerList.add(new ModelViewPager(R.drawable.a7,"VIII BОB. AFRIKA XALQLARI","Afrikaning tarixiy-etnologik tavsif ...",""));
        modelViewPagerList.add(new ModelViewPager(R.drawable.a8,"IX BОB. AMERIKA XALQLARI ETNOLOGIYASI\n","Amerika xalqlarining tarixiy-etnologik tavsif ...",""));
        modelViewPagerList.add(new ModelViewPager(R.drawable.a5,"X BОB. YEVROPA XALQLARI","YEVROPA xalqlarining tarixiy-etnologik tavsif ...",""));
        modelViewPagerList.add(new ModelViewPager(R.drawable.a10,"ETNOLOGIYAGA OID ATAMA VA TUSHUNCHALARNING IZOHLI LUG‘ATI","Avtoxton (yunon. ) – mahalliy, jaydari, tub  ...",""));
        modelViewPagerList.add(new ModelViewPager(R.drawable.a6,"DUNYO MAMLAKATLARI VA ULARNING NUFUZI","AVSTRALIYA VA OKEANIYA ...",""));




    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}