package pl.commercelink.taxonomy;

import java.util.HashMap;
import java.util.Map;

public class BrandMapper {

    private static final Map<String, Brand> LOOKUP_MAP = new HashMap<>();
    private static int DEFAULT_PRIORITY =1;

    static {
        addBrand("Phanteks", "Phanteks", 1);
        addBrand("Kioxia Holdings Corporation", "Kioxia", 1);
        addBrand("Sandisk", "SanDisk", 1);
        addBrand("Endorfy", "Endorfy", 1);
        addBrand("Synology", "Synology", 1);
        addBrand("Hynix", "Hynix", 1);
        addBrand("SuperMicro", "Supermicro", 1);
        addBrand("Supermicro", "Supermicro", 1);
        addBrand("Krux", "KRUX", 1);
        addBrand("KRUX", "KRUX", 1);
        addBrand("Savio", "Savio", 1);
        addBrand("SAVIO", "Savio", 1);
        addBrand("Baseus", "Baseus", 1);
        addBrand("Seasonic", "Seasonic", 1);
        addBrand("3MK", "3MK", 1);
        addBrand("Spigen", "Spigen", 1);
        addBrand("Motorola", "Motorola", 1);
        addBrand("Belkin", "Belkin", 1);
        addBrand("Hama", "Hama", 1);
        addBrand("Panasonic", "Panasonic", 1);
        addBrand("Yealink", "Yealink", 1);
        addBrand("Google", "Google", 2);
        addBrand("OPPO", "OPPO", 1);
        addBrand("OnePlus", "OnePlus", 1);
        addBrand("Huawei", "Huawei", 1);
        addBrand("Nothing", "Nothing", 1);
        addBrand("Inno3D", "Inno3D", 1);
        addBrand("Sparkle", "Sparkle", 1);
        addBrand("Sapphire", "Sapphire", 1);
        addBrand("Sapphire Technology", "Sapphire", 1);
        addBrand("Adobe", "Adobe", 1);
        addBrand("Norton", "Norton", 1);
        addBrand("NORTONLIFELOCK", "Norton", 1);
        addBrand("Corel", "Corel", 1);
        addBrand("Eset", "Eset", 1);
        addBrand("A4 Tech", "A4 Tech", 1);
        addBrand("A4TECH", "A4 Tech", 1);
        addBrand("AMD", "AMD", 2);
        addBrand("Advanced Micro Devices", "AMD", 2);
        addBrand("AOC", "AOC", 1);
        addBrand("AOC INTERNATIONAL", "AOC", 1);
        addBrand("Apple", "Apple", 2);
        addBrand("Arctic", "Arctic", 1);
        addBrand("Arctic Cooling", "Arctic", 1);
        addBrand("AsiaHorse", "AsiaHorse", 1);
        addBrand("Asrock", "Asrock", 1);
        addBrand("ASRock Rack", "Asrock", 1);
        addBrand("Asus", "Asus", 2);
        addBrand("Asustek", "Asus", 2);
        addBrand("be quiet!", "be quiet!", 1);
        addBrand("BE QUIET", "be quiet!", 1);
        addBrand("Thermaltake", "Thermaltake", 1);
        addBrand("BenQ", "BenQ", 1);
        addBrand("Brother", "Brother", 1);
        addBrand("Canon", "Canon", 1);
        addBrand("Coolermaster", "Cooler Master", 1);
        addBrand("Cooler Master", "Cooler Master", 1);
        addBrand("Corsair", "Corsair", 2);
        addBrand("Crucial", "Crucial", 1);
        addBrand("Creative", "Creative Labs", 1);
        addBrand("Creative Labs", "Creative Labs", 1);
        addBrand("Darkflash", "Darkflash", 1);
        addBrand("DELL", "Dell", 2);
        addBrand("DELL TECHNOLOGIES", "Dell", 2);
        addBrand("DeepCool", "DeepCool", 1);
        addBrand("Edifier", "Edifier", 1);
        addBrand("Epos", "Epos", 1);
        addBrand("Epson", "Epson", 1);
        addBrand("PowerColor", "PowerColor", 1);
        addBrand("Fractal Design", "Fractal Design", 1);
        addBrand("G.Skill", "G.Skill", 1);
        addBrand("Gigabyte", "Gigabyte", 2);
        addBrand("Acer", "Acer", 2);
        addBrand("Gainward", "Gainward", 1);
        addBrand("Gembird", "Gembird", 1);
        addBrand("Avtek", "Avtek", 1);
        addBrand("Anker", "Anker", 1);
        addBrand("AnkerMake", "Anker", 1);
        addBrand("HP", "HP", 2);
        addBrand("HP Inc.", "HP", 2);
        addBrand("HYPERX", "HP", 2);        // aquired by HP
        addBrand("Poly", "HP", 2);        // aquired by HP
        addBrand("HP - POLY", "HP", 2);        // aquired by HP
        addBrand("HP HyperX", "HP", 2);
        addBrand("Hewlett-Packard", "HP", 2);
        addBrand("HUION", "HUION", 1);
        addBrand("iiyama", "iiyama", 1);
        addBrand("Intel", "Intel", 2);
        addBrand("Jabra", "Jabra", 1);
        addBrand("JBL", "JBL", 1);
        addBrand("Kingston", "Kingston", 2);
        addBrand("Kingston Fury", "Kingston", 2);
        addBrand("Kingston Technology", "Kingston", 2);
        addBrand("Lenovo", "Lenovo", 2);
        addBrand("Lexar", "Lexar", 1);
        addBrand("LEXAR", "Lexar", 1);
        addBrand("Lexar Media", "Lexar", 1);
        addBrand("LG", "LG", 2);
        addBrand("LG Electronics", "LG", 2);
        addBrand("Lian Li", "Lian Li", 1);
        addBrand("Logitech", "Logitech", 1);
        addBrand("Logitech G", "Logitech", 1);
        addBrand("Microsoft", "Microsoft", 2);
        addBrand("Microsoft OEM", "Microsoft", 2);
        addBrand("Microsoft (OEM)", "Microsoft", 2);
        addBrand("FSP", "FSP", 1);
        addBrand("Sea Sonic", "Sea Sonic", 1);
        addBrand("PowerColor", "Power Color", 1);
        addBrand("Power Color", "Power Color", 1);
        addBrand("Mozos", "Mozos", 1);
        addBrand("MSI", "MSI", 2);
        addBrand("Adata", "Adata", 1);
        addBrand("ADATA", "Adata", 1);
        addBrand("Noctua", "Noctua", 1);
        addBrand("Nzxt", "Nzxt", 1);
        addBrand("Palit", "Palit", 1);
        addBrand("Philips", "Philips", 2);
        addBrand("MICRON", "Micron", 1);
        addBrand("Micron", "Micron", 1);
        addBrand("Toshiba", "Toshiba", 1);
        addBrand("Seagate", "Seagate", 1);
        addBrand("PNY", "PNY", 1);
        addBrand("PNY Technologies", "PNY", 1);
        addBrand("Rode", "Rode", 1);
        addBrand("Patriot", "Patriot Memory", 1);
        addBrand("Patriot Memory", "Patriot Memory", 1);
        addBrand("Samsung", "Samsung", 2);
        addBrand("Sapphire", "Sapphire", 1);
        addBrand("Sennheiser", "Sennheiser", 1);
        addBrand("Sharp", "Sharp", 1);
        addBrand("Shure", "Shure", 1);
        addBrand("Trust", "Trust", 1);
        addBrand("Viewsonic", "Viewsonic", 1);
        addBrand("VIEWSONIC EUROPE", "Viewsonic", 1);
        addBrand("WACOM", "WACOM", 1);
        addBrand("WD", "Western Digital", 2);
        addBrand("Western Digital", "Western Digital", 2);
        addBrand("Xiaomi", "Xiaomi", 1);
        addBrand("Zotac", "Zotac", 1);
        addBrand("ZOWIE", "ZOWIE", 1);
        addBrand("Razer", "Razer", 1);
        addBrand("SteelSeries", "SteelSeries", 1);
        addBrand("Eizo", "Eizo", 1);
        addBrand("Silicon Power", "Silicon Power", 1);
        addBrand("SILICON POWER COMPUTER & COMMUNICAT", "Silicon Power", 1);
        addBrand("Redragon", "Redragon", 1);
    }

    private static void addBrand(String name, String alternateName, int priorityStrength) {
        Brand brand = new Brand(name, alternateName , priorityStrength);
        LOOKUP_MAP.put(name.toLowerCase(), brand);
    }

    public static String unifyBrand(String brandName) {
        if (brandName == null) {
            return null;
        }

        Brand brand = LOOKUP_MAP.get(brandName.toLowerCase());
        if (brand != null) {
            return brand.getAlternateName();
        }
        return brandName;
    }

    public static int getStrength(String brandName) {
        String unified = unifyBrand(brandName);
        if (unified == null) {
            return DEFAULT_PRIORITY;
        }

        Brand brand = LOOKUP_MAP.get(unified.toLowerCase());
        return brand != null ? brand.getPriorityStrength() : DEFAULT_PRIORITY;
    }

    static class Brand {
        private final String name;
        private final String alternateName;
        private final int priorityStrength;

        public Brand( String name, String alternateName, int priorityStrength) {
            this.name = name;
            this.alternateName = alternateName;
            this.priorityStrength = priorityStrength;
        }

        public int getPriorityStrength() {
            return priorityStrength;
        }

        public String getName() {
            return name;
        }

        public String getAlternateName() {
            return alternateName;
        }
    }
}
