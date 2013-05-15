CIS111B-Final
=============
To use program run the com.cis111b.gui.search class.

This program utilizes a JSON based Web Service to access the backend database of the web site ITIS.gov.  

Description of JSON web service - http://www.itis.gov/web_service.html



Two API calls are made:

1. Search By Common Name
http://www.itis.gov/ws_searchApiDescription.html#SrchByCmnName

com.cis111b.gui.search calls the Search By Common Name API which returns JSON formatted data.  This particular method accepts a String as a
parameter and returns a list of common names.  A common name is modeled by gov.usgs.itis.itis_service.data.CommonNames and a list of common
names is modeled by gov.usgs.itis.itis_service.data.SvcCommonNameList.

At the minimum a common name in ITIS is made up of two fields:
Common Name (String)
Taxonomic Serial Number (Integer)

Taxonomic Serial Number or TSN, is the primary key of the Taxonomic Unit table in the ITIS database and represents a single Taxonomic Unit.
It can represent a species, or a higher level of organization like Kingdom, Class, Order, Division, etc.  Each Taxonomic Unit can have more
than one common name, for example, Panther and Cougar are both assigned to the Puma concolor taxonomic unit. 

2. Get Full Hieararchy From TSN
http://www.itis.gov/ws_hierApiDescription.html#getFullHierarchy

com.cis111b.model.TaxonomicUnit calls the Get Full Hierarchy From TSN API which returns JSON formatted data.  This particular method accepts
a TSN as a parameter and returns a list of Taxonomic Units (TSN's) and rank names (ranks = Kingdom, Phylm, Class, Order, Genus, 
Species etc.) which represent the full taxonomic hiearchy of the input TSN. A Hierarchy list element is modeled by 
gov.usgs.itis.itis_service.data.HierarchyList and list of "HierarchyList" elements (which is what ITIS returns) is modeld by 
gov.usgs.itis.itis_service.data.SvcHierarchyList.

The rank names are used to populate the class variables of com.cis111b.model.TaxonomicUnit (e.g. family, genus, kingdom). 



Search Function:

The search function takes two parameters Taxonomic Class and Search String.  The Search String is used in the "Search by Common Name" ITIS
API call's parameter.  The function returns a list of Common Names with their TSN's which are used to instantiate objects.  The type of
objects which are instantiated is determined by the Taxonomic Class search parameter, options include:

Taxonomic Unit
Animalia
Plantae
Felidae
Canidae
Bryophyta
Tracheophyta

Essentially, the Taxonomic Class search parameter determines which Common names get displayed in the search results.  If Taxononic class
"Animalia" is selected and the search String is "striped" then only common names associated with animals (kingdom animalia) will be
returned.  For example Striped Skunk would be returned but not Striped Maple.