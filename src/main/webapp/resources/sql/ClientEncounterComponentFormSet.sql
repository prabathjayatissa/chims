select  name, `ITEM_ID`, `ITEMENCOUNTER_ID`, `ENCOUNTER_ID`, `ITEMCLIENT_ID`, `CREATEDAT`
from component
where `DTYPE` = "ClientEncounterComponentFormSet" 
order by id desc
limit 10;