Feature: Leaftaps Login

Background:
Given launch the browser and load the url as 'http://leaftaps.com/opentaps/'

Scenario:
And enter the username as
|Section|Content|
|Columns|Client name, Address, Date of brith, Plans, Value|
And enter the password as 'crmsfa'
When click the login button