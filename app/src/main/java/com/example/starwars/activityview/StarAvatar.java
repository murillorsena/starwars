package com.example.starwars.activityview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.starwars.PrincipalDrawerNav;
import com.example.starwars.R;
import com.example.starwars.adapters.AvatarAdapter;
import com.example.starwars.adapters.AvatarAdapter.MyViewHolder;
import com.example.starwars.databinding.ActivityMainBinding;
import com.example.starwars.databinding.ActivityStarAvatarBinding;
import com.example.starwars.model.Avatar;
import com.example.starwars.repositoryBd.AvatarRepository;
import com.example.starwars.viewModel.AvatarViewModel;
import com.example.starwars.viewModel.FilmeViewModel;

import java.util.ArrayList;
import java.util.List;

public class StarAvatar extends AppCompatActivity {
    public AvatarRepository avatarRepository;
    private RecyclerView recyclerView;
    private List<Avatar> listavatars = new ArrayList<>();
    private List<Avatar> listavatars2 = new ArrayList<>();
    private Button bt_voltar;


    //AvatarAdapter avatarAdapter = new AvatarAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_star_avatar);

        getSupportActionBar().hide();
        iniciacomponentes();
        this.criaAvatares();


        AvatarRepository.setContext(this);

        AvatarViewModel viewModel = new ViewModelProvider(this).get(AvatarViewModel.class);

        ActivityStarAvatarBinding layout = DataBindingUtil.setContentView(this,R.layout.activity_star_avatar);
        viewModel.getAllAvatars().observe(this, avatar -> {

        });



      LiveData<Avatar> LiveDataAvatar = viewModel.getAvatar();
        LiveDataAvatar.observe(this, new Observer<Avatar>() {
            @Override
            public void onChanged(Avatar avatar) {
                layout.setAvatar(avatar);

            }
        });



      // this.criaAvatares();

        recyclerView = findViewById(R.id.recyclerViewAvatar);

        //configura adapter
        AvatarAdapter avatarAdapter = new AvatarAdapter(listavatars);
        // configura recyclerview
        //RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(avatarAdapter);

    }


    public void voltar(View view){
                Intent intent = new Intent(StarAvatar.this, PrincipalDrawerNav.class);
                startActivity(intent);
    }








    public void criaAvatares(){

        //avatarRepository.getAllAvatars();
        // for (listavatars2 ==)
        // listavatars2.add(avatarRepository);
        //this.listavatars = listavatars2;
        //avatarRepository.getAvatar();
        //System.out.println(avatarRepository);

        Avatar avatar = new Avatar("MESTRE YODA", "https://waie.com.br/starwars/1-yoda-300x300.png");
        this.listavatars.add(avatar);
        avatar = new Avatar("DARTH VADER", "https://waie.com.br/starwars/2-darth_vader-300x300.png");
        this.listavatars.add(avatar);
        avatar = new Avatar("ANAKIN", "https://waie.com.br/starwars/3-anakin-300x300.png");
        this.listavatars.add(avatar);
        avatar = new Avatar("CHEWBACCA", "https://waie.com.br/starwars/5-chewbacca-300x300.png");
        this.listavatars.add(avatar);
        avatar = new Avatar("LEIA", "https://waie.com.br/starwars/4-leia-1-300x300.png");
        this.listavatars.add(avatar);
        avatar = new Avatar("R2D2", "https://waie.com.br/starwars/6-R2D2-300x300.png");
        this.listavatars.add(avatar);
        avatar = new Avatar("OBI WAN", "https://waie.com.br/starwars/7-obi_wan_kenobi-300x300.png");
        this.listavatars.add(avatar);
        avatar = new Avatar("JAR JAR", "https://waie.com.br/starwars/8-jar_jar-300x300.png");
        this.listavatars.add(avatar);
        avatar = new Avatar("LUKE SKYWALKER", "https://waie.com.br/starwars/9-luke-300x300.png");
        this.listavatars.add(avatar);
        avatar = new Avatar("PALPATINE", "https://waie.com.br/starwars/10-palpatine-1-300x300.png");
        this.listavatars.add(avatar);
        avatar = new Avatar("HAN SOLO", "https://waie.com.br/starwars/11-han_solo-300x300.png");
        this.listavatars.add(avatar);
        avatar = new Avatar("AMIDALA", "https://waie.com.br/starwars/12-amidala-300x300.png");
        this.listavatars.add(avatar);
        avatar = new Avatar("BOBA", "https://waie.com.br/starwars/13-boba-300x300.png");
        this.listavatars.add(avatar);
        avatar = new Avatar("C3PO", "https://waie.com.br/starwars/14-C3PO-300x300.png");
        this.listavatars.add(avatar);
        avatar = new Avatar("DARTH MAUL", "https://waie.com.br/starwars/15-darth_maul-300x300.png");
        this.listavatars.add(avatar);
        avatar = new Avatar("DARTH SIDIOUS", "https://waie.com.br/starwars/16-darth_sidious-1-300x300.png");
        this.listavatars.add(avatar);
        avatar = new Avatar("DOOKU", "https://waie.com.br/starwars/17-dooku-300x300.png");
        this.listavatars.add(avatar);
        avatar = new Avatar("FINN", "https://waie.com.br/starwars/18-finn-300x300.png");
        this.listavatars.add(avatar);
        avatar = new Avatar("KYLO REN", "https://waie.com.br/starwars/19-kylo_ren-300x300.png");
        this.listavatars.add(avatar);
        avatar = new Avatar("GENERAL HUX", "https://waie.com.br/starwars/20-general_hux-300x300.png");
        this.listavatars.add(avatar);
        avatar = new Avatar("GENERAL TARKIN", "https://waie.com.br/starwars/21-general_tarkin-1-300x300.png");
        this.listavatars.add(avatar);
        avatar = new Avatar("GRIEVOUS", "https://waie.com.br/starwars/22-grievous-300x300.png");
        this.listavatars.add(avatar);
        avatar = new Avatar("ACKBAR", "https://waie.com.br/starwars/23-ackbar-300x300.png");
        this.listavatars.add(avatar);
        avatar = new Avatar("JABBA", "https://waie.com.br/starwars/24-jabba-300x300.png");
        this.listavatars.add(avatar);
        avatar = new Avatar("JANGO", "https://waie.com.br/starwars/25-jango-300x300.png");
        this.listavatars.add(avatar);
        avatar = new Avatar("LANDO", "https://waie.com.br/starwars/26-lando-300x300.png");
        this.listavatars.add(avatar);
        avatar = new Avatar("MACE", "https://waie.com.br/starwars/27-mace-300x300.png");
        this.listavatars.add(avatar);
        avatar = new Avatar("PASHMA", "https://waie.com.br/starwars/28-pashma-300x300.png");
        this.listavatars.add(avatar);
        avatar = new Avatar("DAMERON", "https://waie.com.br/starwars/29-poe_dameron-300x300.png");
        this.listavatars.add(avatar);
        avatar = new Avatar("QUIN GON JINN", "https://waie.com.br/starwars/30-quin_gon_jinn-300x300.png");
        this.listavatars.add(avatar);
        avatar = new Avatar("REY", "https://waie.com.br/starwars/31-rey-300x300.png");
        this.listavatars.add(avatar);
        avatar = new Avatar("STORMTROOPER", "https://waie.com.br/starwars/32-stormtrooper-300x300.png");
        this.listavatars.add(avatar);


    }

    public void iniciacomponentes(){
        bt_voltar = findViewById(R.id.voltarprincipal);
    }
}

