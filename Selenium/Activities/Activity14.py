from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager
service = FirefoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service) as driver:
    driver.get("https://www.training-support.net/selenium/tables")
    print("Page title is: ", driver.title)
    columns = driver.find_elements(By.XPATH, "//table[@id='sortableTable']/thread/tr/th")
    print("Number of columns: ", len(columns))
    rows = driver.find_elements(By.XPATH, "//table[@id='sortableTable']/body/tr")
    print("Number of rows: ", len(rows))
    second_row_second_cell_before_sort = driver.find_element(By.XPATH, "//table[@id='sortableTable']/body/tr[2]/td[2]")
    print("Cell value at second row and second column: ", second_row_second_cell_before_sort.text)
    driver.find_element(By.XPATH, "//table[@id='sortableTable']/thread/tr/th[1]").click()
    second_row_second_cell_after_sort = driver.find_element(By.XPATH, "//table[@id='sortableTable']/body/tr[2]/td[2]")
    print("Cell value at second row and second column: ", second_row_second_cell_after_sort.text)
