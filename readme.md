## Thymeleaf Standard Expression

### Five types of Thymeleaf standard expression:

- #### ${...} : Variable expressions
- #### *{...} : Selection expressions
- #### #{...} : Message (i18n) expressions
- ##### @{...} : Link (URL) expressions
- #### ~{...} : Fragment expressions
  - [x] There are three basic ways to include content from a fragment
      - [x] th:insert - inserts content inside the tag
      - [x] th:replace - replaces the current tage with the defining the fragment
      - [x] th:include - this is deprecated but it may still appear in a legacy code