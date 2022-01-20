
public class MainActivity extends AppCompatActivity {

    TextView factsCheck;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        factsCheck = findViewById(R.id.factsView);
        String[] myfacts = Facts.getData();

        for(String facts: myfacts){
            factsCheck.append(facts + "\n\n");

        }

    }


}
