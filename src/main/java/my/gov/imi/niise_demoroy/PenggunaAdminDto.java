package my.gov.imi.niise_demoroy;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PenggunaAdminDto extends PenggunaDto {

    private int id; // Or String / UUID depending on your Entity primary key type
}
