package software.ulpgc;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TsvOrganizationLoader tsvOrganizationLoader = new TsvOrganizationLoader("dataset.tsv");
        List<Organization> load = tsvOrganizationLoader.load();
        for (Organization organization : load){
            System.out.println(organization);
        }
    }
}
