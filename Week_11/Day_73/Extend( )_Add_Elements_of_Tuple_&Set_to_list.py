#language list
language=['French']

#language Tuple
language_tuple=('Spanish','Portuguese')

#language set
language_set={'Chinese','Japanese'}

#appending language_tuple elements to language
language.extend(language_tuple)
print('New Language list:',language)

#appending language_set elements to language
language.extend(language_set)
print('Newer Language list:',language)
