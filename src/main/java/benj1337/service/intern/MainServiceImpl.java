package benj1337.service.intern;

import benj1337.domain.Adresse;
import benj1337.domain.AdresseRepository;
import benj1337.service.MainService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.util.List;

public class MainServiceImpl implements MainService {
    private static final Logger LOGGER = LoggerFactory.getLogger(MainServiceImpl.class);

    @Inject
    private AdresseRepository adresseDao;

    @Override
    public void run() {
        Adresse adresse = new Adresse();
        adresse.setOrt("Berlin");
        adresseDao.save(adresse);

        adresse = new Adresse();
        adresse.setOrt("München");
        adresseDao.save(adresse);

        List<Adresse> liste = adresseDao.findAll();
        LOGGER.info("Liste: {}", liste);
    }
}
