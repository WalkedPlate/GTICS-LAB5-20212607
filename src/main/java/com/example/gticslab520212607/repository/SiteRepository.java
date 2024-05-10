package com.example.gticslab520212607.repository;

import com.example.gticslab520212607.dto.IntervencionesPorSitioDto;
import com.example.gticslab520212607.entity.Site;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SiteRepository extends JpaRepository<Site, Integer> {

    @Query(value = "SELECT s.SiteName as sitio, count(ticketid) as intervenciones FROM gticslab6.site s left join gticslab6.ticket t on (t.SiteID = s.siteID) group by s.SiteID;", nativeQuery = true)
    List<IntervencionesPorSitioDto> obtenerIntervencionesPorSitio();
}
